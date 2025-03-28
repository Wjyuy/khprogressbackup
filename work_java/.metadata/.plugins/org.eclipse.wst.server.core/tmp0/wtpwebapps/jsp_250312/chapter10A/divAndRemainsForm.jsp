<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.DivAndRemains" id="dar"></jsp:useBean>
<jsp:setProperty property="*" name="dar"/>

<h4>당신이 입력한 정보입니다</h4>
<%
	if(dar.process()){
		out.print("입력된 정수 "+dar.getNumber()+"은 10의자리와 1의자리가 같습니다.");
	}else{
		out.print("입력된 정수 "+dar.getNumber()+"은 10의자리와 1의자리가 같지 않습니다.");
	}

%>
