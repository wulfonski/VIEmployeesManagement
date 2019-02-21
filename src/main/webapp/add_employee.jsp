<%--
  Created by IntelliJ IDEA.
  User: iosif
  Date: 2/21/2019
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="employeeService" class="com.sda.service.EmployeeService"></jsp:useBean>
<html>
<head>
    <title>Adding a new employee...</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<left>

<form action="login" method="post">
    <body class="container login">
    <div class="login">
        <input type="text" placeholder="Employee Name" name="employeeName"><br>
        <input type="text" placeholder="Department Name" name="departmentName"/>
        <input type="datetime-local" placeholder="Hire Date" name="hireDate"/>
        <input type="submit" value="Add New Employee">
    </div>
    <div class="shadow"></div>

</form>

</left>
</body>
</html>
