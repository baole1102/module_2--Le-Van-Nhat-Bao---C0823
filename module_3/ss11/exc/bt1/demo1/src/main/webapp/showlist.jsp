<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/4/2023
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>'
    <style>
        img{
            height: 80px;
            height: 80px;
        }
        table {
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<h1>Danh sách khách hàng</h1>
<table cellpadding="10px" cellspacing="10px" >
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach items="${list}" var="customer" >
        <tr>
            <td>${customer.name}</td>
            <td>${customer.date}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.img}" alt=""></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
