<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1 class="header__word">Ứng dụng Product Discount Calculator </h1>
<form action="calculator" method="post">
  <input type="text" name="description" placeholder="Product Description">
  <br>
  <input type="text" name="price" placeholder="List Price">
  <br>
  <input type="text" name="discount" placeholder="Discount Percent">
  <br>
  <button type="submit">Calculate Discount</button>
  <hr>
  <br>
  <div>${description}</div>
  Result: ${result}
</form>
</body>
</html>