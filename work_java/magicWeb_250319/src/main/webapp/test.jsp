<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn=null;
	Statement stmt = null;
	ResultSet rs=null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	String sql="select * from emp";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>사원번호</td>
			<td>사원명</td>
			<td>직급</td>
			<td>상관번호</td>
			<td>입사일자</td>
			<td>급여</td>
			<td>커미션</td>
			<td>부서번호</td>
		</tr>
		<%
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn= DriverManager.getConnection(url, user, password);
				stmt=conn.createStatement();
				rs= stmt.executeQuery(sql);
				
				while(rs.next()){
					%>
					<tr>
						<td><%= rs.getInt("EMPNO") %></td>
						<td><%= rs.getString("ENAME") %></td>
						<td><%= rs.getString("JOB") %></td>
						<td><%= rs.getInt("MGR") %></td>
						<td><%= rs.getString("HIREDATE") %></td>
						<td><%= rs.getInt("SAL") %></td>
						<td><%= rs.getString("COMM") %></td>
						<td><%= rs.getInt("DEPTNO") %></td>
					</tr>
					<%
				}
			}catch(SQLException ex){
				out.print("데이터 베이스 연결이 실패했습니다.");
				out.print(ex.getMessage());
			}finally{
				try{
					if(rs != null){rs.close();}
					if(stmt != null){stmt.close();}
					if(conn != null){conn.close();}
				}catch(SQLException se){
					se.printStackTrace();
				}
			}
		%>
	</table>
</body>
</html>