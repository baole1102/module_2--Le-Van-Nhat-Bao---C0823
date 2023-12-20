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
<h1>Sandwich Condiments</h1>
<form action="select">
    <table>
        <tr>
            <td><input type="checkbox" name="condiment" value="Lettuce">Lettuce</td>
            <td><input type="checkbox" name="condiment" value="Tomato">Tomato</td>
            <td><input type="checkbox" name="condiment" value="Mustard">Mustard</td>
            <td><input type="checkbox" name="condiment" value="Sprouts">Sprouts</td>
        </tr>
    </table>
    <input type="submit" value="Save">
</form>
</body>
</html>
