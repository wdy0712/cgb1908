<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>day10..index.jsp</h3>
	<%
	String name = (String)request.getAttribute("name");
	%>
	<%= name %>
</body>
</html>