<%-- 
    Document   : arithmeticcalculator
    Created on : 2022-1-16, 2:26:45
    Author     : Administrater
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label for="firstNum">First: </label>
            <input type="text" name="firstNum" id="firstNum" value="">
            <br>
            <label for="secondNum">Second: </label>
            <input type="text" name="secondNum" id="secondNum" value="">
            <br>
            <button type="submit" name="operation" value="a">+</button>
            <button type="submit" name="operation" value="b">-</button>
            <button type="submit" name="operation" value="c">*</button>          
            <button type="submit" name="operation" value="d">%</button>
        </form>
        <p>Result: ${messagea}</p>
        <a href="/Calculator/age">Age Calculator</a>
    </body>
</html>
