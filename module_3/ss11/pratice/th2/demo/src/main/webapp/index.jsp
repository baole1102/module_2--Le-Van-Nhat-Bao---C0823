<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h2>VietNamDictionary</h2>
<form action="/dictionary" method="post">
  <input type="text" name="search" placeholder="Enter your word: "/> <br>
  <input type = "submit" id = "submit" value = "Search"/>
</form>
<br>
Search : ${search}
<br>
Convert : ${result}
</body>
</html>