package com.sda;

import com.sda.dao.DepartmentDao;
import com.sda.dao.EmployeeDao;
import com.sda.dao.UserDao;
import com.sda.model.Department;
import com.sda.model.Employee;
import com.sda.model.User;
import com.sda.service.EmployeeService;
import com.sda.servlet.AddEmployees;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User user = new User("admin", "admin");
        UserDao userDao = new UserDao();
        userDao.createEntity(user);

//        Department department = new Department();
//        department.setName("Audit");
//        DepartmentDao departmentDao = new DepartmentDao();
//        departmentDao.createEntity(department);
//
//        Department department1 = new Department();
//        department1.setName("Financiar");
//        DepartmentDao departmentDao1 = new DepartmentDao();
//        departmentDao1.createEntity(department1);
//
//        Department department2 = new Department();
//        department2.setName("HR");
//        DepartmentDao departmentDao2 = new DepartmentDao();
//        departmentDao2.createEntity(department2);
//
//        Department department3 = new Department();
//        department3.setName("Contabilitate");
//        DepartmentDao departmentDao3 = new DepartmentDao();
//        departmentDao3.createEntity(department3);
//
//        Department department4 = new Department();
//        department4.setName("IT");
//        DepartmentDao departmentDao4 = new DepartmentDao();
//        departmentDao4.createEntity(department4);
//
//        Department department5 = new Department();
//        department5.setName("Juridic");
//        DepartmentDao departmentDao5 = new DepartmentDao();
//        departmentDao5.createEntity(department5);
//
//        Employee employee = new Employee();
//        employee.setName("Andrei M");
//        employee.setHireDate(LocalDate.now());
//        employee.setDepartment(department);
//        EmployeeDao employeeDao = new EmployeeDao();
//        employeeDao.createEntity(employee);
//
//        Employee employee2 = new Employee();
//        employee2.setName("Victor C");
//        employee2.setHireDate(LocalDate.now());
//        employee2.setDepartment(department2);
//        EmployeeDao employeeDao2 = new EmployeeDao();
//        employeeDao2.createEntity(employee2);
//
//        Employee employee3 = new Employee();
//        employee3.setName("Maria F");
//        employee3.setHireDate(LocalDate.now());
//        employee3.setDepartment(department3);
//        EmployeeDao employeeDao3 = new EmployeeDao();
//        employeeDao3.createEntity(employee3);
//
//        Employee employee5 = new Employee();
//        employee5.setName("Miruna V");
//        employee5.setHireDate(LocalDate.now());
//        employee5.setDepartment(department5);
//        EmployeeDao employeeDao5 = new EmployeeDao();
//        employeeDao5.createEntity(employee5);
//
//        Employee employee6 = new Employee();
//        employee6.setName("Marius L");
//        employee6.setHireDate(LocalDate.now());
//        employee6.setDepartment(department3);
//        EmployeeDao employeeDao6 = new EmployeeDao();
//        employeeDao6.createEntity(employee6);

//        EmployeeService service = new EmployeeService();
//        LocalDate date = LocalDate.now();
//        try {
//            service.insertEmployee("Monica G.",date , 2);
//            System.out.println("Worked");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }
}
