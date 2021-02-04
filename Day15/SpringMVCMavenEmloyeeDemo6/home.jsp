<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
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
	<h1>Hello World!</h1>
	<%
	String msg = (String) request.getAttribute("msg");
	if (msg != null) {
		out.println(msg);
	}
	%>
	<p>Enter Employee Details</p>
	<div class="container">
				<div class="row d-flex justify-content-center">
					<div class="col-md-4">
					<a href="viewEmployee" class="btn btn-info btn-lg text-light" > View Employee</a>
					</div>
				</div>
	</div>
		<div class="row mt-4">
			<form class="form-control col-md-12" action="save" method="get">
				<div class="row">
					<div class="col-md-4  form-group">
						<input type="text" class="form-control" name="empId"
							placeholder="Employee ID">
					</div>
					<div class="col-md-4  form-group">
						<input type="text" class="form-control" name="empName"
							placeholder="Employee Name">
					</div>
					<div class="col-md-4  form-group">
						<input type="text" class="form-control" name="salary"
							placeholder="Employee Salary">
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
