<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="/calculator" method="post">
  First operand : <input type="text" name="txtFist"> <br>
  Operator : <select name="option" id="">
  <option value="+">Addtion</option>
  <option value="-">Minus</option>
  <option value="*">Multiply</option>
  <option value="/">Divide</option>
</select> <br>
  Second operand: <input type="text" name="txtSecond"> <br>
  <input type="submit" value="Calculate">
</form>
<hr>
<h1>Result</h1>
${txtFirst}${operation}${txtSecond}${equal}${result} <br>
</body>
</html>