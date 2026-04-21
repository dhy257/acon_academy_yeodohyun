<%@page import="day05Prac.dto.Acorn"%>
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
	Acorn acorn = (Acorn) request.getAttribute("acorn");
	%>

	<form action="/0421/acorn/update" method="post">
		<input type="text" name="id" readonly=" readonly"> <input
			type="text" name="pw"> <input type="text" name="point">
		<input type="text" name="name" readonly=" readonly"> <input
			type="text" name="birthday" readonly=" readonly">
	</form>
</body>
</html>