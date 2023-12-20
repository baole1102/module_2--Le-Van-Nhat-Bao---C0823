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
<h1>Caculator</h1>
<form action="caculate">
    <table>
        <tr>
            <td><input type="number" name="number1" value="${number1}"></td>
            <td><input type="number" name="number2" value="${number2}"></td>
        </tr>
    </table>
    <input type="submit" name="action" value="+">
    <input type="submit" name="action" value="-">
    <input type="submit" name="action" value="x">
    <input type="submit" name="action" value="/">
</form>
Result Division : ${result}
${Error}
</body>
</html>
