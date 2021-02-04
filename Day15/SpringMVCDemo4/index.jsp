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
	out.println("Enter Two Numbers for Calculation");
	%>
<form action="page"method="post">
<input type="number" min="0" name="num1" />
<input type="number" min="0" name="num2" />
<input type="submit">
</form>
</body>
</html>