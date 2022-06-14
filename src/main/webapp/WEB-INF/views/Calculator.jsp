<%--
  Created by IntelliJ IDEA.
  User: S
  Date: 6/14/2022
  Time: 8:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1 class="result">Calculator</h1>
<form action="/calculator" method="post">
    <td><input type="number" name="num1"></td>
    <td><input type="number" name="num2"></td>
    <p>
        <button type="submit" name="sign" value="+">Addition(+)</button>
        <button type="submit" name="sign" value="-">Subtraction(-)</button>
        <button type="submit" name="sign" value="*">Multiplication(*)</button>
        <button type="submit" name="sign" value="/">Division(/)</button>
    </p>
</form>
<h1 class="result">Result: ${result}</h1>
</body>
</html>