<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Danh sách sản phẩm</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<body>
	<div class="container my-4">
		<h2 class="text-center">Danh sách sản phẩm</h2>
		<table class="table table-striped table-hover">
			<thead class="table-dark">
				<tr>
					<th>Mã</th>
					<th>Tên</th>
					<th>Giá</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${products}">
					<tr>
						<td>${p.id}</td>
						<td>${p.name}</td>
						<td>${p.price}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<!-- Add Bootstrap JS (optional) -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
