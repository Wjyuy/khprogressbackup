<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean class="magic.board.BoardBean" id="board"></jsp:useBean>
<jsp:setProperty property="*" name="board"/>
<%
	BoardDBBean db = BoardDBBean.getInstance();
	int re= db.insertcomment(board);
	if(re==1){
		out.print("댓글 작성 성공!");
	}else{
		out.print("댓글 작성 실패!");
	}
%>