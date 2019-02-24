<%--
  Created by IntelliJ IDEA.
  User: vcoro
  Date: 17.02.2019
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="departmentService" class="com.sda.service.DepartmentService"></jsp:useBean>

<html>
<head>
    <title>Departments</title>
</head
<jsp:include page="header.jsp"/>

<body>
<h1>Departments page!</h1>
<table align="center" border="1" cellpadding="5" class="table_dep">
    <caption><h2>Departments List</h2></caption>

<tr>
    <th>Department ID</th>
    <th>Department Name</th>
</tr>

<c:forEach var="department" items="${departmentService.getAllDepartments()}">
    <tr>
        <td><c:out value="${department.getId()}" /></td>
        <td><c:out value="${department.getName()}" /></td>
    </tr>

</c:forEach>
</body>
</html>
