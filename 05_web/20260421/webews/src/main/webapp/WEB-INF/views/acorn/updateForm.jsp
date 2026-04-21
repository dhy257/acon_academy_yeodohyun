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
		<input type="text" name="id" value="<%=acorn.getId()%>"
			readonly="readonly"> <input type="text" name="pw"
			value="<%=acorn.getPw()%>"> <input type="text" name="point"
			value="<%=acorn.getPoint()%>"> <input type="text" name="name"
			value="<%=acorn.getName()%>" readonly="readonly"> <input
			type="text" name="birthday" value="<%=acorn.getBirth()%>"
			readonly="readonly">
			<button>변경</button>
	</form>
</body>
</html>