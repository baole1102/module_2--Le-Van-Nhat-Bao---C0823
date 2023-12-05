<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/5/2023
  Time: 12:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <a href="/product-servlet">Back</a>
</p>
<h1>Search Product</h1>
<table>
    <tr>
        <th>id</th>
        <th>Tên sản phầm</th>
        <th>Giá sản phẩm</th>
        <th>Mô tả sản phẩm</th>
        <th>Nhà sản xuất</th>
    </tr>
    <c:forEach items="${search}" var="findName">
    <tr>
        <td>${findName.name}</td>
        <td>${findName.price}</td>
        <td>${findName.description}</td>
        <td>${findName.producer}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
