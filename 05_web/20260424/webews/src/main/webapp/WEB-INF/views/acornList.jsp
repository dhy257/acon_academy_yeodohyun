<%@page import="day08Prac.eljstl.Acorn"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border: 1px solid black;
	margin: 0 auto;
}

td {
	border: 1px solid black;
}

h2 {
	text-align: center;
}
</style>
</head>
<body>
	<%
	ArrayList<Acorn> list = (ArrayList<Acorn>) request.getAttribute("list");
	%>
	<h2>에이콘</h2>
	<table>
		<tr>
			<td>아이디</td>
			<td>비번</td>
			<td>이름</td>
		</tr>
		<%
		for (Acorn acorn : list) {
		%>
		<tr>
			<td><%=acorn.getId() %></td>
			<td><%=acorn.getPw() %></td>
			<td><%=acorn.getName() %></td>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>