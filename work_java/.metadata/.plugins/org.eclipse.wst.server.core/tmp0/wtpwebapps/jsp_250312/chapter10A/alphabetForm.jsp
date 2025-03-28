<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.Alphabet" id="alphabet"></jsp:useBean>
<jsp:setProperty property="*" name="alphabet"/>
<% 
	out.print("입력된 알파벳이 "+alphabet.getAlphabet()+"은"+alphabet.process(alphabet.getAlphabet()));
%>