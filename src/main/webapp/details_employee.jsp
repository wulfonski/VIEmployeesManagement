<%@ page import="com.sda.model.Employee" %>
<%@ page import="com.sda.service.EmployeeService" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="com.sda.model.Department" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="employeeService" class="com.sda.service.EmployeeService"></jsp:useBean>

<%--
  Created by IntelliJ IDEA.
  User: iosif
  Date: 23/02/2019
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details for employee</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css">
</head>

<body>

<%
    int int_id_employee = Integer.valueOf(request.getParameter("value").trim());
    Employee employee = employeeService.findById((long) int_id_employee);
%>

<h1>Details of employee:</h1>
<table id="tblDetailEmployee" border = "1" width = "20%" style="cursor: pointer;">
    <tr>
        <td>ID</td>
        <td><%= employee.getId()%></td>
    </tr>

    <tr>
        <td>Name</td>
        <td><%= employee.getName()%></td>
    </tr>
    <tr>
        <td>Hire date</td>
        <td><%=employee.getHireDate()%></td>
    </tr>
    <tr>
        <td>Manager</td>
        <td><%= (employee.getManager()==null?"":employee.getManager().getName())%></td>
    </tr>
    <tr>
        <td>Department</td>
        <td><%= employee.getDepartment().getName()%></td>
    </tr>

</table>

<br>
<form>
    <input type="button" value="Back!" onclick="history.back()">
</form>

</body>
</html>
