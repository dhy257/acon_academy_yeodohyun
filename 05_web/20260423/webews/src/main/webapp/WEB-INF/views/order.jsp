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
	<a href="<%=path%>/home">홈으로</a>
	<h2>Order List</h2>
	<ul>
		<li>선크림</li>
		<li>모자</li>
		<li>반바지</li>
		<li>티셔츠</li>
	</ul>
</body>
</html>