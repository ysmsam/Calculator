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
            <!--label tab will bind with input, once mouse click label text, it will auto select input textbox -->
            <label for="age">Enter your age: </label>
            <input type="text" name="age" id="age">
            <br>
            <input type="submit" value="Age next birthday">
<!--            <button type="submit"> submit</button> button tab can DIY, input cannot -->
        </form>
        <p>${message}</p>
        <!--the $ sign means to tell javascript to look at name of the attribute (inside the {}) -->
        <!--<p style="request.getParameter("age") ? > 1 "good" : "not good"">${age}</p> -->
        <a href="/Calculator/arithmetic">Arithemetic Calculator</a>
    </body>
</html>
