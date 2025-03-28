<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="random.MemberBean" %>
<%@ page import="random.MemberDBBean" %>
<%
    request.setCharacterEncoding("UTF-8");

    String username = request.getParameter("username");
    String password = request.getParameter("password");

    MemberBean member = new MemberBean();
    member.setUsername(username);
    member.setPassword(password);

    MemberDBBean dao = MemberDBBean.getInstance();

    int check = dao.confirmID(username);
    if (check == 1) {
%>
    <script>
        alert("이미 존재하는 아이디입니다.");
        history.back();
    </script>
<%
    } else {
        int result = dao.insertMember(member);
        if (result > 0) {
%>
    <script>
        alert("회원가입 완료! 이제 문으로 들어가세요.");
        location.href = "login.jsp";
    </script>
<%
        } else {
%>
    <script>
        alert("회원가입 실패. 다시 시도해주세요.");
        history.back();
    </script>
<%
        }
    }
%>
