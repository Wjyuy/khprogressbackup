<%@page import="javax.naming.NamingException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn=null;
	PreparedStatement pstmt= null;
	ResultSet rs=null;
	DataSource ds=null;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 목록</title>
</head>
<body>
		<%
			try{
// 				Context ctx= new InitialContext();
// 				ds=(DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
// 				conn=ds.getConnection();
// 				세줄을 한줄로 만들었음(취향따라 ㄱㄱ) 
				conn=((DataSource)(new InitialContext().lookup("java:comp/env/jdbc/mysql"))).getConnection();
				
				
			}catch(NamingException ne){
				ne.printStackTrace();
			}catch(SQLException ex){
				out.print("데이터 베이스 연결이 실패했습니다.");
				out.print(ex.getMessage());
			}
		
		//여기 finally가 중복되서 오류가 있었음 ! 없어야한다 
// 			finally{
// 				try{
// 					if(rs != null){rs.close();}
// 					if(pstmt != null){pstmt.close();}
// 					if(conn != null){conn.close();}
// 				}catch(SQLException se){
// 					se.printStackTrace();
// 				}
// 			}
		
		
	// 		StringBuffer selectQuery = new StringBuffer();
	// 		String id =request.getParameter("id"); 
	// 		selectQuery.append("select name,class,tel from member2 where id=?");
			
			String id="",name="",vclass="",tel="";
			id=request.getParameter("id");
			name=request.getParameter("name");
			vclass=request.getParameter("mclass");
			tel=request.getParameter("tel");
			
			//확인용 로그 
			out.print("@#id=>"+id);
			out.print("@#name=>"+name);
			out.print("@#vclass=>"+vclass);
			out.print("@#tel=>"+tel);
			
			StringBuffer updateQuery = new StringBuffer();
			//이렇게짜면 롤백도 안되서 다 날라갈 수도 있음...**** 한 건 이니까where절
	// 		updateQuery.append("update member2 set name=?, class=?,tel=?");
			
			updateQuery.append("update member set name=?, class=?,tel=? where id=?");
		
			try{ //회의 갔는데 입사했다가 퇴사하면 오류 그대로 나버리니까 여기도 trycatch넣기
				//업데이트 SQL 처리(데이터가 변경되거나 삭제될수도 있기에 예외처리 )
				pstmt=conn.prepareStatement(updateQuery.toString());
				// ? 4개를 순서대로 값 셋팅 (위에 updateQuery순서에 맞춰서 ?위치)
				pstmt.setString(1, name); // varchar2타입은 setString 메소드 사용 
				//setString 그대로 하면 oracle가서 casting 하기에 속도 저하가 됨(넘버는 Int로받자)
				pstmt.setInt(2, Integer.parseInt(vclass)); //int 타입은 setInt메소드사용 
				pstmt.setString(3, tel); 
				pstmt.setString(4, id); 
				
				//업데이트는executeUpdate 
				int re = pstmt.executeUpdate(); //정상적으로 수정시 1이 반환됨
				
				if(re == 1){
					%>
						<%= id %>의 정보가 수정되었습니다.<br>
						[<a href="viewMemberMySql.jsp">목록보기</a>]
					<%
				}else{
					%>
						변경 실패 
					<%
				}
			}catch(SQLException ex){
				out.print("데이터 베이스 연결이 실패했습니다.");
				out.print(ex.getMessage());
			}finally{
				try{
					if(rs != null){rs.close();}
					if(pstmt != null){pstmt.close();}
					if(conn != null){conn.close();}
				}catch(SQLException se){
					se.printStackTrace();
				}
			}
		%>
</body>
</html>