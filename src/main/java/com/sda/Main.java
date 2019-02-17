package com.sda;

import com.sda.dao.DepartmentDao;
import com.sda.dao.EmployeeDao;
import com.sda.dao.UserDao;
import com.sda.model.Department;
import com.sda.model.Employee;
import com.sda.model.User;
import com.sda.service.EmployeeService;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User user = new User("admin", "admin");
        UserDao userDao = new UserDao();
        userDao.createEntity(user);

        Department department = new Department();
        department.setDepartmentName("Audit");
        DepartmentDao departmentDao = new DepartmentDao();
        departmentDao.createEntity(department);

        Employee employee = new Employee();
        employee.setName("Cosmin C");
        employee.setHireDate(LocalDate.now());
        employee.setDepartment(department);
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.createEntity(employee);

//        System.out.println(employee.getName());
//        employeeDao.createEntity(employee);
//        EmployeeService employeeService = new EmployeeService();
//        List <Employee> allEmployees = employeeService.getAllEmployees();
//        System.out.println("All clients are:");
//
//        for(Employee employee: allEmployees){
//            System.out.print(employee.getName()+", ");
//        }


    }
}
