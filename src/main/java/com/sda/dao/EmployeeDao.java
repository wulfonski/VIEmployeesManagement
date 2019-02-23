package com.sda.dao;

import com.sda.model.Employee;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class EmployeeDao extends GenericDao<Employee> {


    public List<Employee> getAllEmployees() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from com.sda.model.Employee");
        List<Employee> allEmployees = query.getResultList();
        transaction.commit();
        return allEmployees;
    }
}



//        Employee employee = new Employee();
//        employee.setName("Andrei M");
//        employee.setHireDate(LocalDate.now());
//        employee.setDepartment(department);
//        EmployeeDao employeeDao = new EmployeeDao();
//        employeeDao.createEntity(employee);