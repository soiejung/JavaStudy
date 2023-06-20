<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	int localVar = 10;
	request.setAttribute("reqAttr", 123);
	%>
	<h1>expression tag vs expression language</h1>
	<ul>
		<li><%=localVar%>
		<li><%=request.getAttribute("reqAttr")%>
		<li>el: ${reqAttr}
	</ul>
	<!--  request.setAttribute("name","홍길동"); -->
	<c:set var="name" value="홍길동" scope="request"></c:set>
	el에 저장된 값 활용: ${name}
	<br>
	<c:set var="root" value="${pageContext.servletContext.contextPath}"></c:set>
	현재의 context path: ${root}
	<br>

	<c:if test="${empty name }">
		이름 속성이 없는듯...
	</c:if>
	<c:if test="${!empty name }">
		이름 속성은 있다!! - ${name }
	</c:if>

	<% List<String> list = List.of("홍길동", "장길산", "임꺽정"); %>
	<c:forEach items="<%=list %>" var="name">
		${name },
	</c:forEach>
	이 있다.
</body>
</html>