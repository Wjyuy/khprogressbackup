<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <% response.setIntHeader("Refresh",5); 
	Calendar cal = Calendar.getInstance();%>
	현재 시간은 <%= cal.get(Calendar.HOUR) %> :  <%= cal.get(Calendar.MINUTE) %> :  <%= cal.get(Calendar.SECOND) %>
	 <%if(cal.get(Calendar.AM_PM)==0){
		 out.print("AM");
	 }else{
		 out.print("PM");
	 } %> --%>
	 
	<%
		response.setIntHeader("Refresh",5); 
		Calendar calendar = Calendar.getInstance();
		String am_pm;
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		if(calendar.get(Calendar.AM_PM)==0){ //0일때 오전
			am_pm="AM";
		}else{
			am_pm="PM";
		}
		String CT=hour+":"+minute+":"+second+am_pm;
		out.print("현재 시간은 "+CT+"<br>");
	%>
	<p><a href="response_data.jsp">Google 홈페이지로 이동하기</a></p> 
</body>
</html>