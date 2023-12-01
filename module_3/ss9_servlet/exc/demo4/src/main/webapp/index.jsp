<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        .btn{
            padding: 5px;
            background-color: aquamarine;
            border-radius: 3px;
            border: 1px solid;
            width: 50px;
            height: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            margin-right: 5px;
        }
    </style>
</head>
<body>
<h1>Thuc hien phep tinh cong tru nhan chia</h1>
<form action="calculate" method="post">
    <lable>So hang 1</lable>
    <input type="text" name="txt1">
    <br>
    <lable>So hang 2</lable>
    <input type="text" name="txt2">
    <input class="btn" type="submit" value="+" name="action">
    <input class="btn" type="submit" value="-" name="action">
    <input class="btn" type="submit" value="*" name="action">
    <input class="btn" type="submit" value="/" name="action">
</form>
</body>
</html>