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
	<%!
		public String calDate(){
			Calendar cal = Calendar.getInstance();
			int year=0;
			int month=0;
			int days=0;
			
			cal.add(Calendar.YEAR,-1);
			cal.add(Calendar.MONTH,-2);
			cal.add(Calendar.DATE,-3);
			
			year=cal.get(Calendar.YEAR);
			month=cal.get(Calendar.MONTH)+1;
			days=cal.get(Calendar.DATE);
			return year+"-"+month+"-"+days;
		}
	%>
	1년 2달 3일 전 = <%=calDate() %><br>
	<%!
		public String getDate(){
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR)-1;
			int month = cal.get(Calendar.MONTH)-1;
			int date = cal.get(Calendar.DATE)-3;
			
			return year+"-"+month+"-"+date; 
		}
	%>
	1년 2달 3일 전 = <%=getDate() %>
</body>
</html>