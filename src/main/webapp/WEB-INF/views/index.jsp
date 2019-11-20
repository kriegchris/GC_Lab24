<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp"
	crossorigin="anonymous">
</head>
<body>
	<div class="jumbotron">
		<h1>Welcome to GC Coffee</h1>
		<a class="btn-primary" href="/register">Register Now!</a>
		<table class="table">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Description</th>
				<th>Quantity</th>
				<th>Price</th>
			</tr>
			<c:forEach var="i" items="${itemList }">
				<tr>
					<td>${i.id }</td>
					<td>${i.name }</td>
					<td>${i.description }</td>
					<td>${i.quantity } lb</td>
					<td><fmt:formatNumber value="${i.price }" type="currency"/></td>
					<%-- <td><a href="/update-food?id=${f.id }" class="btn btn-primary">Update</a></td>
						<td><a href="/delete?id=${f.id }" class="btn btn-primary">Delete</a></td> --%>
				</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>