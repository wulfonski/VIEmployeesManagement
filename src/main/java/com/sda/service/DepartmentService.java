package com.sda.service;

import com.sda.dao.DepartmentDao;
import com.sda.dao.EmployeeDao;
import com.sda.model.Department;
import com.sda.model.Employee;

import java.util.List;

public class DepartmentService {

    private DepartmentDao departmentDao = new DepartmentDao();

    public Department findById(Long id){
        return departmentDao.getEntityById(Department.class, id);

    }

    public List<Department> getAllDepartments (){
        return departmentDao.getAllDepartments();
    }
}
