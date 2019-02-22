<%--
  Created by IntelliJ IDEA.
  User: iosif
  Date: 2/21/2019
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.Date"%>
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

<form action="index.jsp" method="post">
    <br><input type="text" placeholder="Employee Name" name="Employee Name"></br>
    <br><input type="text" placeholder="Department ID" name="Department ID"/></br>
    <br><input type="datetime-local" name="Hire Date"/></br>
    <br><input type="reset" value="Clear" name ="clear"></br>
    <br><input type="submit" value="Submit" name ="submit"></br>
</form>


</left>
</body>
</html>
