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
<h1>View Product</h1>
<table border="1px solid" cellpadding="10px" cellspacing="10px">
<tr>
    <th>id</th>
    <th>Tên sản phầm</th>
    <th>Giá sản phẩm</th>
    <th>Mô tả sản phẩm</th>
    <th>Nhà sản xuất</th>
</tr>
    <tr>
        <td>${requestScope["view"].getId()}</td>
        <td>${requestScope["view"].getName()}</td>
        <td>${requestScope["view"].getPrice()}</td>
        <td>${requestScope["view"].getDescription()}</td>
        <td>${requestScope["view"].getProducer()}</td>
    </tr>
</table>