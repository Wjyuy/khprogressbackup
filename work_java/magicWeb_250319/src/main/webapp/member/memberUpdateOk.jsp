<%@page import="magic.member.MemberDBBean"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="magic.member.MemberBean"></jsp:useBean>
<jsp:setProperty property="*" name="member"/>

<%
	//회원정보를 가지고가서 업데이트(화면에서 넘어옴)
	//보류-회원 아이디를 가지고 가서 회원정보를 가져옴

	String id = (String)session.getAttribute("uid");
	//id값이 null로 들어갔었다 < 세션값을 setter로 넣는다 
	member.setMem_uid(id);
	MemberDBBean manager= MemberDBBean.getInstance();
	int re=manager.updateMember(member);
	
	if(re==1){
		%>
		<script>
			alert("입력하신대로 회원정보가 수정되었습니다.");
			location.href="main.jsp";
		</script>
		<%	
	}else{
		%>
		<script>
			alert("수정이 실패되었습니다.");
			history.back(); //빽
		</script>
		<%	
	}
%>