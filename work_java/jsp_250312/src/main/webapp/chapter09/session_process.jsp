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
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		if(id.equals("admin")&&pw.equals("admin1234")){
			session.setAttribute("userID",id);
			response.sendRedirect("welcome.jsp");
		}else{
			out.print("아이디와 비밀번호를 확인해 주세요.");
		}
	%>
</body>
</html>