<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.TwoArray" id="twoarray"></jsp:useBean>
<jsp:setProperty property="*" name="twoarray"/>
<%
	out.print(twoarray.getNum()+"*"+twoarray.getNum()+"는"+twoarray.process(twoarray.getNum()));
%>