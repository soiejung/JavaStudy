
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
	<h1>로그인 성공</h1>
	"${loginName }""님 반갑습니다.
	<a href="${root }/index.jsp">처음으로</a>

	<h2>구매하고 싶은 것 있어요?</h2>
	<form action="${root }/cart" method="post">
		<input type="text" name="product">
		<input type="submit" value="담아줘">
	</form>
	<h2>현재 장바구니 현황</h2>
	<div>
		<c:if test="${empty cart }">
	아직 장바구니에 담긴 상품이 없습니다.
	</c:if>
		<c:if test="${!empty cart }">
			<c:forEach items="${cart }" var="item">
	${item }<br>
	</c:forEach>
		</c:if>
	</div>
	<form action="${root }/buy" method="post">
		<input type="submit" value="구매">
</body>
</html>