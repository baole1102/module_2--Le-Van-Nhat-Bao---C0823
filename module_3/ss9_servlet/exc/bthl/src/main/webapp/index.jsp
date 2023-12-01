<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/login" method="post">
    <h1>Login</h1>
    <br>
    Username <input type="text" name="username" value="${username}"> <br>
    Password <input type="password" name="password" value="${password}"> <br>
    <input type="submit" name="action">
    <div>${message}</div>
</form>
</body>
</html>