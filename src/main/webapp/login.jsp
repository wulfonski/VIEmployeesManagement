<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1" />


    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <title>Login Page</title>
    <link href="../css/login.css" rel="stylesheet" type="text/css">

</head>

<body>
<form action="login" method="post">

    Please enter your username
    <input type="text" name="un"/><br>

    Please enter your password
    <input type="password" name="pw"/>

    <input type="submit" value="submit">
</form>

</body>
</html>