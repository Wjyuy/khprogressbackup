<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String number= request.getParameter("number");
	%>
<%-- 	<c:set var="number" value="${number}"></c:set> --%>
	<c:set var="number" value="<%=number %>"></c:set>
<%-- 	<c:out value="<%=number %>"></c:out>  --%>
<!-- 다중 조건문 -->
	<c:choose>
		<c:when test="${number %2==0}">
			<c:out value="${number}"></c:out>은 짝수입니다. 
		</c:when>
		<c:when test="${number %2==1}">
			<c:out value="${number}"></c:out>은 홀수입니다. 
		</c:when>
	</c:choose>
</body>
</html>