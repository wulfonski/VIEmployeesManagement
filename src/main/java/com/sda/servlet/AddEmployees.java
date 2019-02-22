package com.sda.servlet;

import com.sda.model.Employee;
import com.sda.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

@WebServlet(name = "/addEmployees")
public class AddEmployees extends HttpServlet {

    private EmployeeService employeeService = new EmployeeService();

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LocalDate date = LocalDate.parse(request.getParameter("hiredate"));
        try {
            Employee employee = employeeService.insertEmployee(request.getParameter("uname"),
                    date,
                    Integer.parseInt(request.getParameter("depid")));

            if (employee != null) {
                response.sendRedirect("addEmployees.jsp");
            } else
                response.sendRedirect("invalidEmployee.jsp"); //error page

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
