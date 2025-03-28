<%@page import="magic.member.MemberBean"%>
<%@page import="magic.member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id=request.getParameter("mem_uid");
	String pwd=request.getParameter("mem_pwd");
	
	MemberDBBean manager=MemberDBBean.getInstance();
	int check= manager.userCheck(id, pwd);
	MemberBean mb=manager.getMember(id);
	
	if(mb==null){ //회원 없음 
		%>
			<script>
				alert("존재하지 않는 회원");
				history.back(); 
// 				history.go(-1); //back이랑 같음
			</script>
		<%
	}else{ //회원있음
		String name=mb.getMem_name();
		if(check==1){ //비밀번호 일치
			//세션에 사용자 정보(id,name) 추가 후 main.jsp로 이동
			session.setAttribute("uid",id); //회원아이디
			session.setAttribute("name",name); //회원이름
			session.setAttribute("Member","yes"); //튕기는기능 넣으려고 회원여부 추가 
			response.sendRedirect("main.jsp");
		}else if(check==0){
		%>
			<script>
				alert("비밀번호가 맞지 않습니다.");
				history.back(); 
			</script>
		<%
		}else{ //아이디가 불일치 (로직상 경우에 맞지않음)
		%>
			<script>
				alert("아이디가 맞지 않습니다.");
				history.back(); 
			</script>
		<%
		}
	}
	
%>