package com.sda.service;

import com.sda.dao.EmployeeDao;
import com.sda.model.Employee;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDao();

    public Employee findById(Long id){
        return employeeDao.getEntityById(Employee.class, id);

    }

    public List<Employee> getAllEmployees (){
        return employeeDao.getAllEmployees();
    }

    public void insertEmployee(Employee employee) {
        employeeDao.createEntity(employee);
    }
}
