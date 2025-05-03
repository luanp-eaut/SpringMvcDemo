<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Danh sách sản phẩm</title></head>
<body>
    <h2>Danh sách sản phẩm</h2>
    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <th>Mã</th>
            <th>Tên</th>
            <th>Giá</th>
        </tr>
        <c:forEach var="p" items="${products}">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
