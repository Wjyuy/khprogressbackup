<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		String user_id="admin";
		String user_pw="admin1234";
	%>
	<% 
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals(user_id) && pw.equals(user_pw)){
			Cookie idcookie = new Cookie("userID",id);
			idcookie.setMaxAge(60*60); //쿠키 기간(1시간) 
			idcookie.setPath("/"); //현재경로 : 윈도우,크롬에 따라 위치가 달라짐
			//크롬 버전에 맞는 위치에 저장을 해주겠다 쿠키에 어디에 저장을하는지 
			response.addCookie(idcookie);
			response.sendRedirect("welcome.jsp");
		}else{
			response.sendRedirect("cookie.jsp");
		}
	%>
	
</body>
</html>