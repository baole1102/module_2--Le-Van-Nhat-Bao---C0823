<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/4/2023
  Time: 10:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p><a href="/product-servlet">Back</a></p>
<form method="post">
    Name: ${requestScope["product"].getName()} <br>
    Price: ${requestScope["product"].getPrice()} > <br>
    Description: ${requestScope["product"].getDescription()} <br>
    Producer: ${requestScope["product"].getProducer()} <br>
    <input type="submit" value="Remove Product">
</form>
</body>
</html>
