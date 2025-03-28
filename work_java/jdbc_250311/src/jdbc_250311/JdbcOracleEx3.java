package jdbc_250311;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOracleEx3 {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("DB 연결 완룟");
			stmt=conn.createStatement();
//			stmt.executeUpdate("INSERT INTO STUDENT3 VALUES('0893012','아무개','컴퓨터공학')");
//			stmt.executeUpdate("update STUDENT3 set id='0189011' where name ='아무개'");
			stmt.executeUpdate("delete from STUDENT3 where name ='아무개'");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB연결오류");
		}
	}
}