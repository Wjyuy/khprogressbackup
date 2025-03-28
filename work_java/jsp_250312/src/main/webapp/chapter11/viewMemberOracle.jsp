<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn=null;
// 쿼리문 이용을 위한 인터페이스 
	Statement stmt = null;
// 쿼리 결과를 받기 위한 인터페이스 
	ResultSet rs=null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	String sql="select * from member2";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 목록</title>
</head>
<body>
	<table width = "800" border="1">
		<tr>
			<td>아이디</td>
			<td>이름</td>
			<td>등급</td>
			<td>전화번호</td>
		</tr>
		<%
			try{
				conn= DriverManager.getConnection(url, user, password);
				stmt=conn.createStatement();
				rs= stmt.executeQuery(sql);
				
				while(rs.next()){
					%>
					<tr>
						<td><%= rs.getString("id") %></td>
						<td><%= rs.getString("name") %></td>
						<td><% 
							int n_class = rs.getInt("class");
							if(n_class ==1){
								out.print("일반회원");
							}else{
								out.print("교수님");
							}
							%>
						</td>
						<td><%= rs.getString("tel") %></td>
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