<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    String[] msg = {
        "화이팅1","화이팅2","화이팅3","화이팅4","화이팅5"
    };

    String[] imgs = {
        "/0415/imgs/cute.jpg",
        "/0415/imgs/cute2.png",
        "/0415/imgs/cute3.jpg"
    };

    int msgIdx = (int)(Math.random() * msg.length);
    int imgIdx = (int)(Math.random() * imgs.length);

    String message = msg[msgIdx];
    String img = imgs[imgIdx];
%>

<h1>오늘의 응원</h1>
<h2><%=message %></h2>
<img src="<%=img %>">
</body>
</html>