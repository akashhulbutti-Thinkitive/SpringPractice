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
<div class="container">
		<div class="row mt-4">
			<form class="form-control col-md-12" action="updateEmployee" method="post">
			<%Employee emp = (Employee)request.getAttribute("employee"); %>
				<div class="row">
					<div class="col-md-4  form-group">
						<input type="text" class="form-control" name="empId"
						value="<%=emp.getEmpId()%>"	placeholder="Employee ID" readonly="readonly">
					</div>
					<div class="col-md-4  form-group">
						<input type="text" class="form-control" name="empName"
						value="<%=emp.getEmpName()%>"	placeholder="Employee Name">
					</div>
					<div class="col-md-4  form-group">
						<input type="text" class="form-control" name="salary"
							value="<%=emp.getSalary()%>"	 placeholder="Employee Salary">
					</div>
				</div>
				<div class="row d-flex justify-content-center">
					<div class="col-md-4 form-group">
						<input type="submit" class="btn btn-primary btn-sm form-control">
					</div>
				</div>
			</form>
		</div>
</div>
</body>
</html>