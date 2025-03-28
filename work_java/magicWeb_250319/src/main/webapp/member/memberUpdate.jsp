<%@page import="magic.member.MemberBean"%>
<%@page import="magic.member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = (String)session.getAttribute("uid"); //강사님 레퍼변은 uid 임 
	
	MemberDBBean manager=MemberDBBean.getInstance();
	MemberBean mb=manager.getMember(id); //강사님 레퍼변은 member임 
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script src="script.js" type="text/javascript"></script>
</head>
<body>
	<table border="1" align="center">
		<form name="upd_frm" method="post" action="memberUpdateOk.jsp">
			<tr height="50">
				<td colspan="2" align="center">
					<h1>회원 정보 수정</h1>
					'*'표시 항목은 필수 입력 항목입니다.
				</td>
			</tr>
			<tr height="30">
				<td width="80">User ID</td>
				<td>
					<%=id %>
				</td>
			</tr>
			<tr height="30">
				<td width="80">암호</td>
				<td><input type="password" size="20" name="mem_pwd">*</td>
			</tr>
			<tr height="30">
				<td width="80">암호 확인</td>
				<td><input type="password" size="20" name="pwd_check">*</td>
			</tr>
			<tr height="30">
				<td width="80">이 름</td>
				<td><%= mb.getMem_name() %></td>
			</tr>
			<tr height="30">
				<td width="80">E-mail</td>
				<td><input type="text" size="30" name="mem_email" value="<%= mb.getMem_email() %>">*</td>
			</tr>
			<tr height="30">
				<td width="80">주 소</td>
				<td><input type="text" size="40" name="mem_address"  value="<%= mb.getMem_address() %>"></td>
			</tr>
			<tr>
				<td colspan="2" align="center" >
<!-- 				check_ok : 자바 스크립트  -->
					<input type="button" onclick="update_check_ok()" value="수정">
					<input type="reset" value="다시입력">
					<input type="button" onclick="location='main.jsp'"value="수정안함">
				</td>
			</tr>
		</form>
	</table>
</body>
</html>