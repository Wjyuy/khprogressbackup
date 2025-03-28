<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//회원이 아니면 null을 가져온다 
	if(session.getAttribute("Member")==null){
		%>
<!-- 		튕기게 하는 애 !! jsp 코드에도 있다  -->
			<jsp:forward page="login.jsp"></jsp:forward>
		<%
	}
%>
<%
	String uid = (String)session.getAttribute("uid");
	String name = (String)session.getAttribute("name");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center">
		<form method="post" action="logout.jsp">
			<tr height="30">
				<td>
					안녕하세요.<%= name %>(<%= uid %>) 님!
				</td>
			</tr>
			<tr height="30">
				<td align="center">
					<input type="submit" value="로그아웃">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="button" value="회원정보변경" onclick="location='memberUpdate.jsp'">
				</td>
			</tr>
		</form>
	</table>
</body>
</html>