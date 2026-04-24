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
	int kor = (int) request.getAttribute("kor");
	%>
	<%=kor%>
	${kor}
	<br>

	<h2>EL은 저장소의 값만 사용할 수 있다</h2>
	<ul>
		<li>pageContext : jsp 페이지 내에서만 사용하는 저장소 = EL, JSTL 사용을 위해서</li>
		<li>request : 하나의 요청이 공유하는 장소 => 응답되면 종료 == mvc 패턴에서 사용하는 저장소</li>
		<li>session : 하나의 사용자가 공유하는 저장소, 서버가 사용자별로 저장소를 제공함</li>
		<li>application : 하나의 프로젝트, 하나의 프로그램이 공유하면서 사용하는 저장소 = 설정정보를 저장하고
			사용함</li>
	</ul>

	<h2>저장소 값 꺼내는 순서, 찾는 순서</h2>
	<h2>pageContext => request => session => application 순서로 찾는다</h2>

	<%
	pageContext.setAttribute("id", "id pageContext");
	request.setAttribute("id", "id request");
	session.setAttribute("id", "id session");
	application.setAttribute("id", "id application");
	%>

	<h3>EL로 id 값을 꺼내온다면 결과는 ???</h3>
	${id}
	<!-- 있는 거 기준으로 pageContext부터 찾아서 appliaction까지 감 -->

	<p>답은 id pageContext : 이유는 pageContext 저장소부터 확인하고 찾으면 땡이기 떄문</p>

	<h2>저장소에서 값을 꺼내올 때 scope를 들어낼 수 있다</h2>
	<!-- 다른건 뒤지지 말고 pageScope의 id만 꺼내란 뜻 -->
	${pageScope.id }<br>
	<!-- 다른건 뒤지지 말고 requestScope의 id만 꺼내란 뜻 -->
	${requestScope.id }<br>
	<!-- 다른건 뒤지지 말고 sessionScope의 id만 꺼내란 뜻 -->
	${sessionScope.id }<br>
	<!-- 다른건 뒤지지 말고 applicationScope의 id만 꺼내란 뜻 -->
	${applicationScope.id }<br>

	<h3>pageContext 저장소는 EL, jstl을 사용하기 위해 이용함</h3>
	<%String str = "나도 EL 사용하고 싶다"; %>
	${str } <!-- 여기선 못씀 -->
	<%pageContext.setAttribute("str", str); %> <!-- 저장소 담김 -->
	${str } <!-- 여기선 사용가능 -->
</body>
</html>