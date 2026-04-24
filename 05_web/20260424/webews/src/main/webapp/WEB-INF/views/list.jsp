<%@page import="day08Prac.PagingHandler"%>
<%@page import="day08Prac.Member"%>
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
	ArrayList<Member> list = (ArrayList<Member>) request.getAttribute("list");
	PagingHandler handler = (PagingHandler) request.getAttribute("handler");
	%>


	<h2>페이징 정보 출력하기</h2>
	<table>
		<tr>
			<td>M_ID</td>
			<td>M_NAME</td>
		</tr>

		<%
		for (Member member : list) {
		%>
		<tr>
			<td><%=member.getM_id()%></td>
			<td><%=member.getM_pw()%></td>
		</tr>

		<%
		}
		%>
	</table>

	<!-- 페이지네이션 정보 출력하기 -->
	<%
	for (int i = handler.getGrpStartPage(); i <= handler.getGrpEndPage(); i++) {
	%>
	[
	<%=i%>]
	<%
	}
	%>
</body>
</html>