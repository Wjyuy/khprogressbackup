<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		if(session.getAttribute("userID")==null){
			response.sendRedirect("session_out.jsp");
		}
// 		Enumeration enum_id = session.getAttributeNames();
// 		int i=0;
// 		String id;
// 		String value;
// 		while(enum_id.hasMoreElements()){
// 			i++;
// 			id = enum_id.nextElement().toString();
// 			value= session.getAttribute(id).toString();
// 			if(value.equals("")){
// 				response.sendRedirect("session_out.jsp");
// 			}
// 			if(value.equals("admin")){
// 				out.print(value+"님 어서오세요.");
// 			}
// 		}

	
	%>
	<h4><%= session.getAttribute("userID") %>님 반갑습니다.</h4>
	<a href="session_out.jsp">로그아웃</a>
</body>
</html>