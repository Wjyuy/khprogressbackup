<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	Cookie[] cookies = request.getCookies();

	for(int i=0; i<cookies.length;i++){
		out.print(i+"번째 쿠키의 이름 =>"+cookies[i].getName()+"삭제<br>");
		//기간을 0으로 해서 쿠키 삭제
		cookies[i].setMaxAge(0);
		cookies[i].setPath("/");
		//삭제정보를 추가.
		response.addCookie(cookies[i]);
		//여기 세마리는 셋이 세트임 ! 같이 움직인다
	}
%>