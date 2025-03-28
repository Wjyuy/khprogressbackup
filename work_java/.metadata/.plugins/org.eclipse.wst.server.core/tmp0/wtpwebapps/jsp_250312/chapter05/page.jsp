<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 내가 쓴 오답(출력은 똑같이 되는데 답이 엄청 간단한 코드였음 )
	현재날짜 :
	<%Date date= new Date();%>
	<%=date%>
	<br>
	<%! int pow(int x){
			return (int)Math.pow(x,2);
		} 
	%>
	5의 제곱 :
	<%= pow(5) %>
	 --%>
	현재 날짜 : <%= new Date() %> <br>
	5의 제곱 : <%= Math.pow(5,2) %>
</body>
</html>