<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/4/2023
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        button {
            height: 30px;
            width: 60px;
            background-color: aquamarine;
        }
    </style>
</head>
<body>
<h1>Ứng dụng quản lý sản phẩm</h1> <br>
<c:if test='${requestScope["message"] != null}'>
    <span class="message">${requestScope["message"]}</span>
</c:if>
<form action="/product-servlet?action=search" method="get">
    <input type="hidden" name="action" value="search">
    Tim ten san pham : <input type="text" name="findName">
    <input type="submit" ><br>
</form>
<button>
    <a href="/product-servlet?action=create">Them</a>
</button>
<table border="1px solid" cellpadding="5px">
    <tr>
        <th>id</th>
        <th>Tên sản phầm</th>
        <th>Giá sản phẩm</th>
        <th>Mô tả sản phẩm</th>
        <th>Nhà sản xuất</th>
        <th>Sua</th>
        <th>Xoa</th>
        <th>Cap Nhat</th>
    </tr>
    <c:forEach items="${list}" var="product" varStatus="loop">
    <tr>
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.price}</td>
        <td>${product.description}</td>
        <td>${product.producer}</td>
        <td><a href="/product-servlet?action=edit&id=${product.id}">Sua</a></td>
        <td><a href="/product-servlet?action=delete&id=${product.id}">Xoa</a></td>
        <td><a href="/product-servlet?action=view&id=${product.id}">Chi tiet</a></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
