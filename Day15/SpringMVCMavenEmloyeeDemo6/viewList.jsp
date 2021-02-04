<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,com.akash.DAy15_SpringMVCMavenEmployee6.model.Employee"%>
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
	<%
	String msg = (String) request.getAttribute("msg");
	if (msg != null) {
		out.println(msg);
	}
	%>
<div class="container">
				<div class="row d-flex justify-content-center">
					<div class="col-md-4">
					<a href="home" class="btn btn-info btn-lg text-light" > Add Employee</a>
					</div>
				</div>
<div class="row">
	<%
	List<Employee> list =(List<Employee>) request.getAttribute("list");
	%>
	<table class="table table-striped table-condensed">
		<tr>
			<th>Employee Id</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<%
		if (list!=null) {
			for (Employee emp : list) {
		%>
		<tr>
			<td><%=emp.getEmpId()%></td>
			<td><%=emp.getEmpName()%></td>
			<td><%=emp.getSalary()%></td>
			<td><a href="updateEmployee?empId=<%=emp.getEmpId()%>" class="btn btn-sm btn-warning">Update</a> </td>
			<td><a href="deleteEmployee?empId=<%=emp.getEmpId()%>" class="btn btn-sm btn-danger">Delete</a> </td>		</tr>
		<%
		}
		} else {
		%>
		<tr>
			<td colspan="5">List is Empty</td>
		</tr>
		<%
		}
		%>
	</table>
	</div>
</div>
</body>
</html>