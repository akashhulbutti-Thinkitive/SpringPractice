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
<div class="container">
		<div class="row d-flex justify-content-center mt-2 mb-2">
			<a href="viewEmployees" class="btn btn-md btn-primary">View
				Records</a>
		</div>
		
		<div class="row d-flex justify-content-center mt-2 mb-2">
			<form action="updateEmployee" class="form-control col-md-12">
				<%Employee emp = (Employee) request.getAttribute("emp"); %>
				<div class="row">
					<div class="col-md-4">
						<input type="text" name="empid" value="<%=emp.getEmpid()%>" readonly="readonly" class="form-control">
					</div>
					<div class="col-md-4">
						<input type="text" name="ename" value="<%=emp.getEname()%>" class="form-control">
					</div>
					<div class="col-md-4">
						<input type="text" name="salary" value="<%=emp.getSalary()%>" class="form-control" >
					</div>
				</div>
				<div class="row">
				<div class="col-md-4">
						<input type="submit" value="Submit" class=" btn btn-success btn-md form-control">
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>