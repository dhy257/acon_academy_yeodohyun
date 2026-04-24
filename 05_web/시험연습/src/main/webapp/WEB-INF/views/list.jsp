<%@page import="시험연습.DTO.Acorn"%>
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
	<h2>에이콘 목록</h2>
	<%
	ArrayList<Acorn> list = (ArrayList<Acorn>) request.getAttribute("list");
	%>

	<table>
		<tr>
			<td>아이디</td>
			<td>비번</td>
			<td>이름</td>
			<td>포인트</td>
			<td>생년월일</td>
		</tr>
		<%
		for (Acorn acorn : list) {
		%>
		<tr>
			<td><%=acorn.getId()%></td>
			<td><%=acorn.getPw()%></td>
			<td><%=acorn.getName()%></td>
			<td><%=acorn.getPoint()%></td>
			<td><%=acorn.getBirth()%></td>
		</tr>
		<%
		}
		%>
	</table>
	<a href="/시험연습/acorn/home">홈으로</a>
</body>
</html>