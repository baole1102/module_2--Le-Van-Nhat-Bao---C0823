
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> San Pham</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<a href="/product-servlet">back</a>
<form method="post">
    ID: <input type="number" name="id" required> <br>
    Name: <input type="text" name="name" required> <br>
    Price: <input type="number" name="price" required> <br>
    Description: <input type="text" name="description" required> <br>
    Producer: <input type="text" name="producer" required>
    <input type="submit" value="Add">
</form>
</body>
</html>
