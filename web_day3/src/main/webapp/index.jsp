<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.servletContext.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	// scriptlet: _jsp service의 local 영역!
	String name = "hong";
	%>

	<!-- expression -->
	<%=name%>

	<%!// <%! - declaration tag: member 구성 
	public String hi(String name) {
		return "hi " + name;
	}%>

	<%=hi("jang")%>

	<h1>더해볼까??</h1>
	<form action="${root }/add" method="get">
		<input type="checkbox" name="type" value="forward" id="check">
		<label for="check">forward</label>
		<input name="num1" type="text">
		<input name="num2" type="text">
		<input type="submit" value="더해!!">
	</form>

	<c:if test="${empty loginName }">
		<h1>로그인 해볼까? - 세션에서 loginName이 없을 때만 필요</h1>
		<form action="${root }/login" method="post">
			<input name="id" type="text">
			<input name="pass" type="text">
			<input type="submit" value="로그인">
		</form>
	</c:if>
	<c:if test="${!empty loginName }">
		${loginName }님 반갑습니다.
		<a href="${root }/logout">로그아웃</a>
	</c:if>

	<h1>쿠키 확인</h1>
	<a href="${root }/CookieMaker?type=forward">forward로 쿠키 만들기</a>
	<br>
	<a href="${root }CookieMaker?type=redirect">redirect로 쿠키 만들기</a>
	<br>

	<h1>scope 확인</h1>
	<a href="${root }/FirstServlet?type=forward">forward로 Scope 확인</a>
	<br>
	<a href="${root }/FirstServlet?type=redirect">redirect로 Scope 확인</a>
	<br>
</body>
</html>