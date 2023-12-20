<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/18/2023
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:th="http://www.thymeleaf.org" lang="en">
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>Id</td>
        <td>Tên</td>
        <td>Email</td>
        <td>Address</td>
    </tr>
    <tr th:each="list , ststus : ${lists}">
        <td></td>
    </tr>
    < items="${list}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.email}</td>
            <td>${list.address}</td>
        </tr>
    </>
</table>
</body>
</html>
