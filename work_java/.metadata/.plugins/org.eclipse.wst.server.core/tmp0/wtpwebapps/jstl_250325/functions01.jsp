<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>java 문자열 검색</p>
	<p>fn:contains: 문자열 포함 여부</p>
<!-- 	대소문자 구분함 -->
	<p>Hello, Java Server Pages! => ${fn:contains("Hello, Java Server Pages!","java")}</p>
	<p>Hello, Java Server Pages! => ${fn:contains("Hello, Java Server Pages!","Java")}</p>
	
	<p>fn:containsIgnoreCase: 문자열 포함 여부(대소문자 관계없음)</p>
	<p>Hello, Java Server Pages! => ${fn:containsIgnoreCase("Hello, Java Server Pages!","java")}</p>
	<p>Hello, Java Server Pages! => ${fn:containsIgnoreCase("Hello, Java Server Pages!","Java")}</p>
</body>
</html>