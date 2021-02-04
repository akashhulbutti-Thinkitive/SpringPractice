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
		out.println(request.getAttribute("modelObjAdd"));
	out.println(request.getAttribute("modelObjSub"));
	out.println(request.getAttribute("modelObjMul"));
	out.println(request.getAttribute("modelObjDiv"));
	%>
</body>
</html>