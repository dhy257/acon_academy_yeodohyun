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
	String path = request.getContextPath();
	%>
	<a href="<%=path%>/login">로그인</a>
	<a href="<%=path%>/logout">로그아웃</a>
	<a href="<%=path%>/order.do">주문정보조회하기</a>
</body>
</html>