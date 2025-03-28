<%@page import="random.MemberDBBean"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
    request.setCharacterEncoding("UTF-8");

    String username = request.getParameter("username");
    String password = request.getParameter("password");

    MemberDBBean dao = MemberDBBean.getInstance();
    int result = dao.userCheck(username, password);

    if (result == 1) {
        session.setAttribute("id", username);
%>
    <script>
        alert("문제은행이 열렸습니다! 입장합니다.");
        location.href = "question.jsp";
    </script>
<%
    } else if (result == 0) {
%>
    <script>
        alert("비밀번호가 일치하지 않습니다.");
        history.back();
    </script>
<%
    } else {
%>
    <script>
        alert("존재하지 않는 아이디입니다.");
        history.back();
    </script>
<%
    }
%>
