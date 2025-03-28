package jdbc_250311;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOracleEx2 {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt=null;
		try {
//			오라클 드라이버 로드 (오라클 설치파일에서 가져옴)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("DB 연결 완룟");
//			sql 문 처리용 Statement 객체생성
			stmt=conn.createStatement();
//			테이블의 모든 데이터 검색
			ResultSet rs = stmt.executeQuery("select * from student3");
			printData(rs, "id", "name","dept");
//			rs = stmt.executeQuery("select id,name,dept from student3 where name='이기자'");
//			printData(rs, "id", "name","dept");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB연결오류");
		}
	}
	//레코드의 각 열의 값 화면에 출력(컬럼의 값을 체크) 
	private static void printData(ResultSet rs,String col1,String col2,String col3) throws SQLException {
		
		//레코드의 각 열의 값 화면에 출력 
//	private static void printData(ResultSet rs) {
//		데이터개수 있는만큼 반복
		while (rs.next()) {
			if (!col1.equals("")) {
				//col1이 null 이 아니면 아이디 출력 
				System.out.print(rs.getString("id"));
			}
			if (!col2.equals("")) {
				System.out.print("\t|\t"+rs.getString("name"));
			}
			if (!col3.equals("")) {
				System.out.println("\t|\t"+rs.getString("dept"));
			}
		}
	}
}

//ID CHAR(7)  가져와서 편하게 보기 용도 
//,NAME VARCHAR2(10)
//, DEPT VARCHAR2(20)