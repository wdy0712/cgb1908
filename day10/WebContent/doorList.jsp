<%@page import="java.util.List"%>
<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>day10..doorList.jsp</h3>
	显示所有门店信息: <br/>
	<%
	List<String> list = (List<String>)request.getAttribute("list");
	
	for(String door :list){
		out.write(door+"<br/>");
	}
	%>
</body>
</html>