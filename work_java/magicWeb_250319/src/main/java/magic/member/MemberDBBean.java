package magic.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDBBean {
	//jsp 소스에서 member DB빈 객체 생성을 위한 참조변수 
	private static MemberDBBean instance = new MemberDBBean();
	
	//memberDBBean 객체 레퍼런스를 리턴하는 메소드
	public static MemberDBBean getInstance() {
		return instance;
	}
	
	// 이 메소드만 호출하면 DBCP 사용한다.
	// 쿼리 작업에 사용할 커넥션 객체를 리턴하는 메소드(dbcp 기법)
	public Connection getConnection() throws Exception {
		return ((DataSource)(new InitialContext().lookup("java:comp/env/jdbc/oracle"))).getConnection();
	}
	
	//전달인자로 받은 member를 memberT 테이블에 삽입하는 메소드
	public int insertMember(MemberBean member) throws Exception {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int re=-1; //초기값 -1 인데 insert 정상적으로 실행되면 1 
		String sql = "insert into memberT values(?,?,?,?,?)";
		
		try {
			//decp 기법 연결 객체
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			//메소드 파라미터로 받은 member 객체에서 getter setter이용해 받아온다
			pstmt.setString(1, member.getMem_uid());
			pstmt.setString(2, member.getMem_pwd());
			pstmt.setString(3, member.getMem_name());
			pstmt.setString(4, member.getMem_email());
			pstmt.setString(5, member.getMem_address());
			//insert 니까 executeUpdate메소드 이용
			re= pstmt.executeUpdate(); 
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return re;
	}
	
	//회원가입시 아이디 중복 확인할때 사용되는 메소드
	public int confirmID(String id) throws Exception {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		int re=-1; //초기값 -1 , 아이디가 중복되면 1
		
		//매개변수로 받은 id를 ? 인 쿼리 파라미터에 매핑 
		String sql = "SELECT mem_uid,mem_pwd,mem_name,mem_email,mem_address from memberT where mem_uid=?";
		
		try {
			//decp 기법 연결 객체
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs= pstmt.executeQuery(); 
			
			//rs 가 있다 == 아이디가 일치하는 로우 존재 
			if (rs.next()) { 
				re=1;
			} else { //rs=0 (쿼리문으로 테이블이 안 나온 경우)=> 해당 아이디 존재하지 않음 
				re=-1;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return re;
	}
	
	//사용자 인증 시 사용하는 메소드
	public int userCheck(String id, String pwd) throws Exception{
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		String db_mem_pwd="";
		int re=-1; // 초기값 -1, 비밀번호 일치하면 1, 비밀번호 불일치하면 0 
		
		String sql = "SELECT mem_pwd from memberT where mem_uid=?";
		
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs= pstmt.executeQuery(); 
			
			//rs 가 있다 == 아이디가 일치하는 로우 존재 
			if (rs.next()) {
				db_mem_pwd=rs.getString("mem_pwd");
				if(db_mem_pwd.equals(pwd)) { //패스워드도 일치
					re=1;
				}else { //패스워드가 불일치
					re=0;
				}
			} else { //rs=0 해당 아이디 존재하지 않음 
				re=-1;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return re;
	}
	
	//아이디가 일치하는 멤버의 정보를 얻어오는 메소드
	public MemberBean getMember(String id) throws Exception{
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		String sql = "SELECT * from memberT where mem_uid=?";
		MemberBean member=null;
		
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs= pstmt.executeQuery(); 
			
			if (rs.next()) {
				member=new MemberBean();
				member.setMem_uid(id);
				member.setMem_pwd(rs.getString("mem_pwd"));
				member.setMem_name(rs.getString("mem_name"));
				member.setMem_email(rs.getString("mem_email"));
				member.setMem_address(rs.getString("mem_address"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return member;
	}
	public int updateMember(MemberBean member) throws Exception {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int re=-1;  
		
		String sql = "update memberT set mem_pwd=?, mem_email=?, mem_address=? where mem_uid=?";
		
		try {
			
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
//			System.out.println("@#pwd=>"+member.getMem_pwd());
//			System.out.println("@#email=>"+member.getMem_email());
//			System.out.println("@#addr=>"+member.getMem_address());
//			System.out.println("@#uid=>"+member.getMem_uid());
			
			pstmt.setString(1,member.getMem_pwd());
			pstmt.setString(2,member.getMem_email());
			pstmt.setString(3,member.getMem_address());
			pstmt.setString(4,member.getMem_uid());
			re= pstmt.executeUpdate(); 
			System.out.println("변경성공");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("변경실패");
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return re;
	}
}


