<%@ page contentType="text/html; charset=UTF-8" %>
<%
    String username = (String) session.getAttribute("id");
    if (username == null) 
    {
        response.sendRedirect("login.jsp");
        return;
    }

    // 랜덤 PDF 선택
    String uploadPath = application.getRealPath("/upload");
    java.io.File folder = new java.io.File(uploadPath);
    java.io.File[] pdfFiles = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".pdf"));

    String pdfName = null;
    if (pdfFiles != null && pdfFiles.length > 0) {
        // 새 랜덤 인스턴스를 매번 생성
        java.util.Random rand = new java.util.Random();
        int index = rand.nextInt(pdfFiles.length);
        pdfName = pdfFiles[index].getName();
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>랜덤 문제 출제</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Silkscreen&display=swap');
        body {
            background-color: #0e0e0e;
            font-family: 'Silkscreen', cursive;
            color: #00ffcc;
            padding: 40px;
            text-align: center;
        }
        .box {
            margin: auto;
            width: 80%;
            background: #1a1a1a;
            border-radius: 12px;
            padding: 20px;
            box-shadow: 0 0 20px rgba(0,255,150,0.3);
        }
        a.button {
            display: inline-block;
            margin-top: 20px;
            padding: 12px 20px;
            background-color: #00ffcc;
            color: #000;
            font-weight: bold;
            border-radius: 10px;
            text-decoration: none;
        }
        a.button:hover {
            background-color: #00e6b2;
        }
        .logout {
            margin-top: 20px;
            font-size: 13px;
        }
        .logout a {
            color: #00ffcc;
            text-decoration: none;
        }
    </style>
</head>
<body>
    <div class="box">
        <h2>✨ 랜덤 문제 출제 완료!</h2>
        <% if (pdfName != null) { %>
            <a class="button" href="upload/<%= pdfName %>" target="_blank">📄 문제 열기 (크롬 뷰어)</a><br>
            <a class="button" href="question.jsp">🎲 다시 뽑기</a>
        <% } else { %>
            <p>문제 파일이 없습니다.</p>
        <% } %>

        <div class="logout">
            <a href="logout.jsp">🚪 나가기</a>
        </div>
    </div>
</body>
</html>
