<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList"%>
<%@ page import="실습.회원조회"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<caption>회원 조회</caption>
		<tr>
			<td>회원ID</td>
			<td>이름</td>
			<td>나이</td>
			<td>등록일자</td>
			<td>TRAINER_ID</td>
			<td>가슴</td>
			<td>등</td>
			<td>팔</td>
			<td>어깨</td>
			<td>하체</td>
		</tr>

		<%
		ArrayList<회원조회> list = (ArrayList<회원조회>) request.getAttribute("list");

		for (회원조회 m : list) {
		%>

		<tr>
			<td><%=m.getMember_id()%></td>
			<td><%=m.getName()%></td>
			<td><%=m.getAge()%></td>
			<td><%=m.getReg_date()%></td>
			<td><%=m.getTrainer_id()%></td>
			<td><%=m.getChest()%></td>
			<td><%=m.getBack()%></td>
			<td><%=m.getArm()%></td>
			<td><%=m.getShoulder()%></td>
			<td><%=m.getLeg()%></td>
		</tr>

		<%
		}
		%>
	</table>

</body>
</html>