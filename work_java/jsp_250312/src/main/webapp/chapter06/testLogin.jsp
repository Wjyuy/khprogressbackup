<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String s_id="hong";
	String s_pw="1234";
	String s_name="홍길동";
	
	//아이디, 비밀번호가 일치하면 main.jsp로 자동이동 
	if(s_id.equals(request.getParameter("id"))&& s_pw.equals(request.getParameter("pw"))){
		//response.sendRedirect("main.jsp");
		//변수이기때문에 +s_name 해서 붙인다
		//main.jsp?name= : main.jsp로 name값을 넘김 
		//response.sendRedirect("main.jsp?name="+s_name);
		//URLEncoder.encode(s_name, "UTF-8") 변수에있는 한글 값을 인코딩
		response.sendRedirect("main.jsp?name="+URLEncoder.encode(s_name, "UTF-8"));
	}else{
		response.sendRedirect("login.html");
	}
	
%>