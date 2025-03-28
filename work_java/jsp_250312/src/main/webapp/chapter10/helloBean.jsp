<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--     HelloBean 클래스로 myBean 객체 생성  -->
<!-- scope="page" : 이 페이지에서 객체를 쓰겠다.  -->
<!-- id: 레퍼런스 변수명 -->
<jsp:useBean class="hello.HelloBean" id="myBean" scope="page"></jsp:useBean>
<hr>
*. 빈 생성 후 저장된 값 출력하기<br>
이름 : <%= myBean.getName() %> <br>
나이 : <%= myBean.getAge() %><br>
<hr>
*. 값을 변경한 후 출력하기<br>
<% myBean.setName("전수빈"); %>
<% myBean.setAge(10); %>
이름 : <%= myBean.getName() %> <br>
나이 : <%= myBean.getAge() %><br>