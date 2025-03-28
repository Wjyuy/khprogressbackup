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
	//String sql="select id,pw,name,class,tel from member2";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
%>
	<%
		String id="",pw="",name="",vclass="",phone1="",phone2="",phone3="";
		id=request.getParameter("id");
		pw=request.getParameter("pw");
		name=request.getParameter("name");
		vclass=request.getParameter("mclass");
		phone1=request.getParameter("phone1");
		phone2=request.getParameter("phone2");
		phone3=request.getParameter("phone3");
		try{
			conn= DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
// 			rs= stmt.executeQuery(sql);

			StringBuffer insertQuery = new StringBuffer();
			//insert 쿼리 조립
			insertQuery.append("insert into member2 values('");
			insertQuery.append(id+"','");
			insertQuery.append(pw+"','");
			insertQuery.append(name+"','");
			insertQuery.append(vclass+"','");
			insertQuery.append(phone1+"-"+phone2+"-"+phone3+"')");
			
			//잘 만들었는지 확인 (출력해서) 
			out.print(insertQuery);
			
			//executeUpdate 메소드 : insert할때 사용, 몇개 insert받았는지 확인가능
			int re =stmt.executeUpdate(insertQuery.toString());
			
			//인서트 한개 됐기 때문에 1이 올 것 
			if(re == 1){
				%>
					추가성공
					<br>
					<a href="addFormOracle.html">추가작업</a>		
					<a href="viewMemberOracle.jsp">조회작업</a>		
				<%
			}else{
				%>
					<font color="red">추가실패 ㅠ.ㅠ</font>				
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
</body>
</html>