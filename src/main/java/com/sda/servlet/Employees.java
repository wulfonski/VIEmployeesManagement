package com.sda.servlet;

import com.sda.dao.EmployeeDao;
import com.sda.model.Employee;
import com.sda.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

//@WebServlet(value = "/employees")
@WebServlet(value = "/addEmployee")
public class Employees extends HttpServlet {

    private EmployeeDao employeeDao = new EmployeeDao();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Employee employee = employeeDao.getEntityById(Employee.class, 1L);
        Employee allEmployee = (Employee) employeeDao.getAllEmployees();
        response.getWriter().println("Hello World!");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String name = request.getParameter("name");
            LocalDate hireDate = LocalDate.parse(request.getParameter("hireDate"));
            Integer departmentID = Integer.valueOf(request.getParameter("departmentID"));
            Employee employee = employeeDao.insertEmployee(name, hireDate, departmentID);
            request.setAttribute("employee", employee);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("addEmployees.jsp");
    }
}
