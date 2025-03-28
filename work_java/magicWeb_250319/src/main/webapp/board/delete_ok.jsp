<%@page import="java.io.File"%>
<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean class="magic.board.BoardBean" id="board"></jsp:useBean>
<jsp:setProperty property="*" name="board"/>

<%
	String pageNum= request.getParameter("pageNum");
	int bid = Integer.parseInt(request.getParameter("b_id"));
	String b_pwd = request.getParameter("b_pwd");
	
	BoardDBBean db = BoardDBBean.getInstance();
	
	//파일 삭제를 위한 처리 (이름은 중복때문에 이렇게 했슴/..)
 	BoardBean board1= db.getBoard(bid, false);
	String fName = board1.getB_fname();
	String up="C:\\develop\\work_java\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\magicWeb_250319\\upload";
	
	//글삭제를 위해 글번호와 비밀번호로 메소드호출
	int re =db.deleteBoard(bid,b_pwd);
	
	if(re==1){
		//파일 삭제 
		if(fName!=null){
			File file = new File(up+fName);
			file.delete();
		}
		//비밀번호 일치로 글목록 이동
		%>
			<script>
// 				alert("글이 삭제되었습니다!");
// 				history.go(-3); 얘는 쓰면 새로고침안된 상태라 안되겠다 
			</script>
		<%
		response.sendRedirect("list.jsp?pageNum="+pageNum);
// 		out.print("삭제되었습니다");
	}else if(re==0){
		//비밀번호 틀림
		%>
			<script>
				alert("비밀번호가 맞지 않습니다.");
				history.go(-1);
			</script>
		<%
	}else if(re==-1){
		%>
			<script>
				alert("삭제에 실패하였습니다.");
				history.go(-1);
			</script>
		<%
		
	}
%>