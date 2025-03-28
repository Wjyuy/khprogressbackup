<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie lastDate=null;
	String msg=""; //화면 출력 메시지
	boolean found=false; //처음 방문 여부 
	String newValue =""+ System.currentTimeMillis(); //현재시간 정보를 위한 값
	Cookie[] cookies= request.getCookies(); //쿠키 객체배열 생성
	
	if(cookies != null){ //값이 있으면
		out.print("@# cookies.length=> "+cookies.length);
	
		for(int i=0;i<cookies.length;i++){ //찾았을때는 = 첫방문 아님 
			lastDate= cookies[i];
		//반복하면서 쿠키이름이 lastDateCookie 가 있으면 처음 방문이 아님
			if(lastDate.getName().equals("lastDateCookie")){
				found=true;
				break;
			}
		}
//		if / else 처음방문, 아닐때 (lastdate 쿠키객체에 값이 있음으로 판별 )
		if(!found){ //처음방문
			msg="처음 방문입니다...";
//		처음 방문일때 lastDateCookie 쿠키이름으로 시간정보를 저장 
			lastDate = new Cookie("lastDateCookie",newValue);
			lastDate.setMaxAge(365*24*60*60);
			lastDate.setPath("/");
			response.addCookie(lastDate);
		}else{ //처음 방문이 아님(lastdate 쿠키객체에 값이 있음)
//			String conv = lastDate.getValue(); // String 말고 long 타입으로 캐스팅필요. 
//			lastDate 쿠키에 있는 시간정보 값을 long 변수로 가져옴
			long conv = Long.parseLong(lastDate.getValue());
//			Date 객체로 의미있는 시간 정보를 출력
			msg="당신의 마지막 방문 : "+new Date(conv);
//			다음 방문을 위한 값 설정
			lastDate.setValue(newValue);
			response.addCookie(lastDate);
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2><%=msg%></h2>
</body>
</html>