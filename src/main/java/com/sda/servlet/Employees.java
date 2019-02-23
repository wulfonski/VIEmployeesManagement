package com.sda.servlet;

import com.sda.dao.EmployeeDao;
import com.sda.model.Department;
import com.sda.model.Employee;
import com.sda.model.User;
import com.sda.service.DepartmentService;
import com.sda.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

@WebServlet(value = "/employees")
public class Employees extends HttpServlet {

    private EmployeeService employeeService = new EmployeeService();
    private DepartmentService departmentService = new DepartmentService();

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        LocalDate date = LocalDate.parse(request.getParameter("hiredate"));
        Employee employee = new Employee();
        Department department = departmentService.findById(Long.parseLong(request.getParameter("depid")));
        employee.setName(request.getParameter("uname"));
        employee.setDepartment(department);
//
        employeeService.insertEmployee(employee);

        if (employee != null) {
            response.sendRedirect("employees.jsp");

        } else
            response.sendRedirect("invalidEmployee.jsp"); //error page

    }


}
