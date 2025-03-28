<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.ThreeSixNine" id="ThreeSixNine"></jsp:useBean>
<jsp:setProperty property="*" name="ThreeSixNine"/>

<h4>당신이 입력한 정보입니다.</h4>
<%
	out.print("입력된 정수가 "+ThreeSixNine.getNum()+"은 "+ThreeSixNine.process(ThreeSixNine.getNum()));
%>
