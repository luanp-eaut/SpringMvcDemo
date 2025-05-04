<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng ký</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="card">
					<div class="card-header text-center">
						<h4>Đăng ký</h4>
					</div>
					<div class="card-body">
						<form:form modelAttribute="user" action="${pageContext.request.contextPath}/register" method="post">
							<div class="mb-3">
								<label for="username" class="form-label">Tên đăng nhập:</label>
								<form:input path="username" id="username" cssClass="form-control" />
								<form:errors path="username" cssClass="text-danger" />
							</div>
							<div class="mb-3">
								<label for="password" class="form-label">Mật khẩu:</label>
								<form:password path="password" id="password" cssClass="form-control" />
								<form:errors path="password" cssClass="text-danger" />
							</div>
							<div class="mb-3">
								<label class="form-label">Giới tính:</label><br>
								<div class="form-check form-check-inline">
									<form:radiobutton path="gender" value="Male" cssClass="form-check-input" id="male" />
									<label for="male" class="form-check-label">Nam</label>
								</div>
								<div class="form-check form-check-inline">
									<form:radiobutton path="gender" value="Female" cssClass="form-check-input" id="female" />
									<label for="female" class="form-check-label">Nữ</label>
								</div>
								<br/>
								<form:errors path="gender" cssClass="text-danger" />
							</div>
							<div class="mb-3 form-check">
								<form:checkbox path="termsAccepted" cssClass="form-check-input" id="terms" />
								<label for="terms" class="form-check-label">Tôi đồng ý điều khoản</label>
							</div>
							<div class="d-grid">
								<input type="submit" value="Đăng ký" class="btn btn-primary" />
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Thêm Bootstrap JS (tùy chọn) -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>