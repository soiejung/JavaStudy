<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전달된 정보 확인(second.jsp)</h1>
	<ul>
		<li>
			request parameter:
			<%=request.getParameter("type")%>
		<li>
			request attribute:
			<%=request.getAttribute("reqAttr")%>
		<li>
			session attribute:
			<%=session.getAttribute("sesAttr")%>
		<li>
			application attribute:
			<%=application.getAttribute("appAttr")%>
	</ul>
</body>
</html>