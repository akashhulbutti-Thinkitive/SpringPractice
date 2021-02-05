<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page
	import="java.util.List,com.akash.Day16_SpringMVCHIbernateDictionaryAssignment4.model.DictionaryClass"%>

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
		<div class="row mt-4">
			<div class="col-md-6">
			<div class="row d-flex justify-content-center">
					<div class="col-md-6 text-center badge badge-info text-light ">Add Words</div>
				</div>
				<form class="form-control mt-4" action="add" method="get">
					<div class="row form-group">
						<div class="col-md-5">
							<input type="text" name="word" class="form-control"
								placeholder="Enter Word here">
						</div>
						<div class="col-md-7">
							<textarea name="meaning" style="resize: none;"
								class="form-control" placeholder="Enter Word here">
								</textarea>
						</div>
					</div>
					<div class="row d-flex justify-content-center">
						<div class="col-md-3">
							<input type="submit" class=" btn btn-secondary btn-sm text-light"
								value="Submit" />
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-6">
				<div class="row d-flex justify-content-centers">
					<div class="col-md-12 text-center badge badge-info text-light ">All Words</div>
				</div>
				<div class="row mt-4 ">
					<table class="table table-striped text-center align-items-center">
						<tr>
							<th>Id</th>
							<th>Word</th>
							<th>Meaning</th>
						</tr>
						<%
						List<DictionaryClass> list = (List<DictionaryClass>) request.getAttribute("list");
						if (list.size()>0) {
							for (DictionaryClass dict : list) {
						%>
						<tr>
							<td><%=dict.getDid()%></td>
							<td><%=dict.getWord()%></td>
							<td><%=dict.getMeaning()%></td>
							<%-- 		<td><a href="deleteEmployee?empid=<%=dict.getDid()%>" class="btn btn-sm btn-danger" > Delete</a></td> --%>
						</tr>
						
						<%
						} }else {
						
						%>
						<tr>
							<td colspan="5"> No Words</td>
						</tr>
						<%
						}
						%>
					</table>
				</div>
			</div>

		</div>
	</div>
</body>
</html>
