<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="area.Circle2" id="circle2"></jsp:useBean>
<jsp:setProperty property="*" name="circle2"/>

<h4>당신이 입력한 정보입니다</h4>
<%
	out.print("반지름이 "+circle2.getN()+"인 원의 면적은"+circle2.process(circle2.getN())); 
%>
