
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<a href="/product-servlet">back</a>
<form method="post">
    Name: <input type="text" name="name" value="${requestScope["product"].getName()}"> <br>
    Price: <input type="text" name="price" value="${requestScope["product"].getPrice()}"> <br>
    Description: <input type="text" name="description" value="${requestScope["product"].getDescription()}"> <br>
    Producer: <input type="text" name="producer" value="${requestScope["product"].getProducer()}">
    <input type="submit" value="Edit">
</form>
</body>
</html>
