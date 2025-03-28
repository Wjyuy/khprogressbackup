<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean class="question.Arithmetic" id="arithmetic"></jsp:useBean>
<jsp:setProperty property="*" name="arithmetic"/>
<h4>당신이 입력한 정보입니다</h4>
<% 
	out.print(arithmetic.getNum1()+"와"+arithmetic.getNum2()+"의 계산결과는"+arithmetic.process(arithmetic.getNum1(), arithmetic.getNum2(), arithmetic.getOperator()));
%>
