<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h2>Currency Converter</h2>
<form action="/converter" method="post">
  Rate: <input type="text" name="rate" placeholder="Rate" value="22000"> <br>
  USD: <input type="text" name="usd" placeholder="USD" value="0"> <br>
  <input type="submit" id="submit" value="Converter">
  <hr>
  Rate :${rate}
  <br>
  USD :${usd}
  <br>
  VND :${result}
</form>
</body>
</html>