<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 02:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<jsp:useBean id="employeeService" class="com.sda.service.EmployeeService"></jsp:useBean>
<jsp:useBean id="userService" class="com.sda.service.UserService"></jsp:useBean>


<html>
<head>
    <title>Employees</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css">
</head>
<jsp:include page="header.jsp"/>
<body>
<h1>Employees page!</h1>
<%--<span><c:out value="${employeeService.findById(1).getName()}"/></span>--%>
<%--<c:forEach items="${employeeService.findById(1)}" var="employee">--%>
<%--<span><c:out value="${employee.getName()}"/></span>--%>
<%--</c:forEach>--%>
<%--<c:forEach items="${userService.findById(1)}" var="user">--%>
<%--<span><c:out value="${employee.getUsername()}"/></span>--%>
<%--</c:forEach>--%>

<table align="center" id="tblEmployee" border="1" cellpadding="5" class="table_emp">
    <caption><h2>List of employees</h2></caption>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Hire date</th>
        <th>Manager</th>
        <th>Department</th>
        <th>Actions</th>
    </tr>

    <c:forEach var="employee" items="${employeeService.getAllEmployees()}">
        <tr>
            <td><c:out value="${employee.getId()}"/></td>
            <td onclick="getIdEmployee(this)"><c:out value="${employee.getName()}"/></td>
            <td><c:out value="${employee.getHireDate()}"/></td>
            <td><c:out value="${employee.getManager().getName()}"/></td>
            <td><c:out value="${employee.getDepartment().getName()}"/></td>
            <td>
                <button onClick="window.location='editEmployee.jsp';">Edit</button>
                <button onclick="window.location='deleteEmployee.jsp';">Delete</button>
            </td>
        </tr>

    </c:forEach>

    <tr>
        <td align="left">
            <button id="add" onClick="window.location='addEmployees.jsp';">Add Employee</button>
        </td>
    </tr>

</table>
<button align="center" id="index" onClick="window.location='addEmployees.jsp';">Add Employee</button>
</form>

<script>
    function getIdEmployee(x) {
        var table = document.getElementById('tblEmployee');
        for (var i = 1; i < table.rows.length; i++) {
            table.rows[i].onclick = function () {
                var id_employee = this.cells[0].innerHTML;
                location.href = "details_employee.jsp?value=" + id_employee;
            };
        }
    }
</script>
</body>
</html>
