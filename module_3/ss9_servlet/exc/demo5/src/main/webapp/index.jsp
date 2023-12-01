<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<div style="align-items: center">
    <h1>Dang ba dien thoai</h1>
    <form action="SearchAccount" method="post">
        <lable>Ten thue bao</lable>
        <input type="text" name="txtName"> <br>
        So dien thoai <input type="text" name="txtNumber"> <br>
        Dia chi <input type="text" name="txtAddress"> <br>
        <input type="submit" name="action" value="search">
    </form>
</div>
</body>
</html>