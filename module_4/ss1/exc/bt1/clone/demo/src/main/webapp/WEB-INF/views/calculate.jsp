<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/18/2023
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Ứng dụng chuyển đổi tiền tệ</h1>
<form action="/" method="get">
    <table>
        <tr>
            <td>USD:</td>
            <td><input type="text" name="usd"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Convert"></td>
        </tr>
    </table>
</form>
<br>
Result: ${result}
${Error}
</body>
</html>
