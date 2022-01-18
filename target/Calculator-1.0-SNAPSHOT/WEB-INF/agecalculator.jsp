<%-- 
    Document   : agecalculator
    Created on : 2022-1-16, 1:34:54
    Author     : Administrater
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
        
        <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            <!--label tab will bind with input, once mouse click label text, it will auto select input textbox-->
            <!--label tab will bind with input, once mouse click label text, it will auto select input textbox -->
            <label for="age">Enter your age: </label>
            <input type="text" name="age" id="age">
            <br>
            <input type="submit" value="Age next birthday">
        </form>
        <p>${message}</p>
        <a href="/Calculator/arithmetic">Arithemetic Calculator</a>
    </body>
</html>
