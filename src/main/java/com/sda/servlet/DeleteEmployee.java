package com.sda.servlet;

import com.sda.model.Employee;
import com.sda.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/delete")
public class DeleteEmployee extends HttpServlet {

    private EmployeeService employeeService = new EmployeeService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long employeeId = Long.valueOf(request.getParameter("idEmp"));
        Employee employee = employeeService.findById(employeeId);
        employeeService.deleteEmployee(employee);
        response.sendRedirect("employees.jsp");
    }

}
