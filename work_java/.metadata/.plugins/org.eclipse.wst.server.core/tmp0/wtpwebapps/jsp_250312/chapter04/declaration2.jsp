<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 변수, 메소드 선언문으로 해야함, 스크립트 릿은 메소드 선언 안 됨 --%>
	<%!
		int sum(int a, int b){
			return a+b;
		}
	%>
	<% 
		out.print("2+3="+sum(2, 3));
	%>
</body>
</html>