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
// 	Statement stmt = null;
	PreparedStatement pstmt= null;
	ResultSet rs=null;
	DataSource ds=null;
	
	/*
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	String sql="select * from member2";
	*/
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
				Context ctx= new InitialContext();
				ds=(DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
				conn=ds.getConnection();
				StringBuffer selectQuery = new StringBuffer();
				String id =request.getParameter("id"); // jsp?id= 쿼리뭐시기 id 가 여기 id 임!
				selectQuery.append("select name,class,tel from member2 where id=?");
// 				dbcp 연걸정보 객체(conn)으루 가지고 prepareStatement 메소드호출해서
// 				preparedStatement 객체 생성해서 쿼리 사용
				pstmt=conn.prepareStatement(selectQuery.toString());
// 				setString 메소드 : 쿼리 파라미터 값을 저장 
				pstmt.setString(1, id);
				rs=pstmt.executeQuery();
				
// 				while(rs.next()){
				if(rs.next()){
// 				폼 써서 수정화면에서 정보를 들고가야한다 
					%> 
					<form method="post" action="updateProcessOracle.jsp">
						아 이 디 : <input type="text" name="id" value="<%= id %>"><br>
						회원이름 : <input type="text" name="name" value="<%= rs.getString("name")%>"><br>
						회원등급 : <input type="text" name="mclass" value="<%= rs.getString("class")%>"><br>
						전화번호 : <input type="text" name="tel" value="<%= rs.getString("tel")%>"><br>
						<input type="submit" value="수정">
						<a href="viewMemberOracle.jsp">목록보기</a>
					</form>
				<%				
			}else{
				%>
					<font color="red">아이디 없3~~~</font>
					<a href="viewMemberOracle.jsp">목록보기</a>
				<%					
			}
		}catch(NamingException ne){ //dbcp name 을 못찾을때 오류 
			ne.printStackTrace();
		}catch(SQLException ex){
			out.print("데이터 베이스 연결이 실패했습니다.");
			out.print(ex.getMessage());
		}
		finally{
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