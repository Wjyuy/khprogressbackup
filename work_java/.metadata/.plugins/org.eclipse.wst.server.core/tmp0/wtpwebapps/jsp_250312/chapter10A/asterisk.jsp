<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean class="question.Asterisk" id="asterisk"></jsp:useBean>
<jsp:setProperty property="*" name="asterisk"/>
<% 
	out.print("입력된 정수가 "+asterisk.getNum()+"는<br>"+asterisk.process(asterisk.getNum()));
%>