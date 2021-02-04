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
String msg =(String)request.getAttribute("modelObj");
if(msg!=null){
		out.println(msg);
		
}
	out.println("Enter Two Numners for Calculation");
	%>
	<form action="page"method="post">
<input type="text" name="username" />
<input type="password" name="password" />
<input type="submit">
</form>
</body>
</html>