<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.util.List,com.akash.Da16_SringMVCHibernateEmployeeCrud3.models.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container mt-4">
		<div class="row d-flex justify-content-center">
			<a href="home" class="btn btn-primary btn-md">Add Employee</a>
		</div>
		<div class="row mt-2">
		<table class="table">
		<tr><th>Id</th><th>Name</th><th>Salary</th><th>Update</th><th>Delete</th></tr>
	<% List<Employee> list = (List<Employee>) request.getAttribute("list");
		if(list.isEmpty()){
	%>
		<tr><td colspan="5"></td></tr>
		<%}else{for(Employee emp:list){ %>
		<tr>
		<td><%=emp.getEmpid()%></td>
		<td><%=emp.getEname()%></td>
		<td><%=emp.getSalary()%></td>
		<td><a href="getOneEmployee?empid=<%=emp.getEmpid()%>" class="btn btn-sm btn-warning" > Update</a></td>
		<td><a href="deleteEmployee?empid=<%=emp.getEmpid()%>" class="btn btn-sm btn-danger" > Delete</a></td>
		</tr>
		<%}} %>
		</table>
		</div>
	</div>
</body>
</html>