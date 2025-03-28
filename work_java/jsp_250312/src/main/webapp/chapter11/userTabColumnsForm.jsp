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
// 	String sql="select * from USER_TAB_COLUMNS";
	StringBuffer selectQuery = new StringBuffer();
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테이블조회</title>
</head>
<body>
	<table width="400" border="1">
		<tr>
			<td>컬럼명</td>
			<td>컬럼형식</td>
			<td>컬럼길이</td>
			<td>널값여부</td>
		</tr>
		<%
			try{
				String search= request.getParameter("search");
				out.print("@# = > search "+search);
				
				conn= DriverManager.getConnection(url, user, password);
				stmt=conn.createStatement();
				selectQuery.append("select column_name");
				selectQuery.append(", data_type");
				selectQuery.append(", data_length");
				selectQuery.append(", nullable");
				selectQuery.append("  from user_tab_columns"); // FROM 앞에 띄워쓰기 오류(안하면안됨)
				selectQuery.append(" WHERE table_name= '"+search+"'"); //where 앞에 띄워쓰기
				//뒤로가기 했을때는 append 되서 동작 안하기 때문에 0으로초기화
				rs= stmt.executeQuery(selectQuery.toString());
				selectQuery.setLength(0);
				
				//스트링버퍼를 RS 에 toString 해서 담음 
				while(rs.next()){
// 					if(rs.getString("table_name").equals(search)){
					%>
					<tr>
						<td><%= rs.getString("COLUMN_NAME") %></td>
						<td><%= rs.getString("DATA_TYPE") %></td>
						<td><%= rs.getInt("DATA_LENGTH") %></td>
						<td><%= rs.getString("NULLABLE") %></td>
					</tr>
					<%
						
// 					}
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