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
	<div class="container">
		<div class="row d-flex justify-content-center mt-2 mb-2">
			<a href="getAllEmployees" class="btn btn-md btn-primary">View
				Records</a>
		</div>
		<div class="row d-flex justify-content-center mt-2 mb-2">
			<form action="addEmployee" class="form-control col-md-12">
				<div class="row">
					<div class="col-md-4">
						<input type="text" name="empid" class="form-control" placeholder="ID" />
					</div>
					<div class="col-md-4">
						<input type="text" name="ename" class="form-control" placeholder="Employee Name" />
					</div>
					<div class="col-md-4">
						<input type="text" name="salary" class="form-control" placeholder="Salary" />
					</div>
				</div>
				<div class="row d-flex justify-content-center">
				<div class="col-md-4 mt-2 mb-2">
						<input type="submit" value="Submit" class=" btn btn-success btn-md form-control">
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
