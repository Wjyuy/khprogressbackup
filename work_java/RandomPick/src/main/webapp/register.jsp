<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>아이디 만들기</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Silkscreen&display=swap');

        body {
            background-color: #0e0e0e;
            font-family: 'Silkscreen', cursive;
            color: #00ffcc;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .box {
            background: #1a1a1a;
            border: 2px solid #444;
            padding: 40px;
            border-radius: 16px;
            text-align: center;
            box-shadow: 0 0 20px rgba(0, 255, 150, 0.3);
        }

        input, button {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border-radius: 8px;
            border: none;
            font-size: 14px;
        }

        input {
            background-color: #2a2a2a;
            color: #fff;
        }

        button {
            background-color: #00ffcc;
            color: #000;
            font-weight: bold;
            cursor: pointer;
        }

        .link {
            margin-top: 10px;
            font-size: 12px;
        }

        .link a {
            color: #00ffcc;
            text-decoration: none;
        }
    </style>
</head>
<body>
    <div class="box">
        <h2>아이디 만들기</h2>
        <form action="registerOk.jsp" method="post">
            <input type="text" name="username" placeholder="아이디" required>
            <input type="password" name="password" placeholder="비밀번호" required>
            <button type="submit">아이디 만들기</button>
        </form>
        <div class="link">
            이미 아이디가 있으신가요? <a href="login.jsp">로그인으로 이동</a>
        </div>
    </div>
</body>
</html>
