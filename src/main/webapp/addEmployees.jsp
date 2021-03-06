<%--
  Created by IntelliJ IDEA.
  User: iosif
  Date: 2/21/2019
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ page import="java.util.Date" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="employeeService" class="com.sda.service.EmployeeService"></jsp:useBean>
<jsp:useBean id="departmentService" class="com.sda.service.DepartmentService"></jsp:useBean>
<html>
<head>
    <title>Adding a new employee...</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css">

</head>
<jsp:include page="header.jsp"/>

<body>

<form action="employees" method="POST">

    <br><input type="text" placeholder="Employee Name" name="uname"></br>
    <%--<br><input type="text" placeholder="Department ID" name="depid"/></br>--%>
    <br><input type="date" name="hiredate"/></br>
    Choose the Manager:&nbsp;
    <select name="managerid">
        <c:forEach var="manager" items="${employeeService.getAllEmployees()}">
            <option value="${manager.getId()}"> ${manager.getName()}</option>
        </c:forEach>
    </select></br>

    Select a Department:&nbsp;
    <select name="depid">
        <c:forEach var="department" items="${departmentService.getAllDepartments()}">
            <option value="${department.getId()}"> ${department.getName()}</option>
        </c:forEach>
    </select></br>

    <br><input type="reset" value="Clear" name="clear"></br>
    <br><input type="submit" value="submit" name="submit"></br>


</form>

</body>
</html>
