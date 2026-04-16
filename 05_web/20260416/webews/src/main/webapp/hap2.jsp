<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	table{
	border :1px solid black;
	}
	td{
	border :1px solid black;
	}
	
</style>
<title>Insert title here</title>
</head>
<body>

<table>
	<tr>
	<td>1</td>
	<td>2</td>
	<td>3</td>
	</tr>
	<tr>
	<td>1</td>
	<td>2</td>
	<td>3</td>
	</tr>
	<tr>
	<td>1</td>
	<td>2</td>
	<td>3</td>
	</tr>
</table>
<h2>사용자가 입력한 수까지의 합 구하기</h2>
<%
	int su = Integer.parseInt(request.getParameter("su"));
	int sum = 0;
	for( int i=1; i<=su; i++){
		sum+=i;
	}
	out.println(sum);
%>
<p>
<%=sum %>
</p>
</body>
</html>