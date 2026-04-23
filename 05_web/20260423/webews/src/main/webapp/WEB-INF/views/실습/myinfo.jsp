<%@page import="실습.Acorn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
Acorn acorn = (Acorn) request.getAttribute("acorn");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 정보</title>
</head>
<body>

	<a href="<%=path%>/home">홈으로</a>

	<h2>내 정보 수정</h2>

	<form method="post" action="<%=path%>/myinfo.do">

		<p>
			아이디 :
			<%=acorn.getId()%></p>

		<p>
			이름 :
			<%=acorn.getName()%>
		</p>

		<p>
			포인트 : <input type="text" name="point" value="<%=acorn.getPoint()%>">
		</p>

		<p>
			비밀번호 : <input type="text" name="pw" value="<%=acorn.getPw()%>">
		</p>

		<button type="submit" name="action" value="update">정보 수정하기</button>
		<button type="submit" name="action" value="delete"
			onclick="return confirm('정말 탈퇴하시겠습니까?');">회원 탈퇴하기</button>

	</form>

</body>
</html>