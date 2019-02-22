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

    public Employee insertEmployee(String name, LocalDate hireDate, int departmentID) throws SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = new Employee();
        Query query = session.createQuery("INSERT INTO com.sda.model.Employee (name, hire_date, department_id)" + " VALUES (?, ?, ?)");
        query.setParameter(1, name);
        query.setParameter(2, hireDate);
        query.setParameter(3, departmentID);
        query.executeUpdate();
        transaction.commit();
        session.close();
        return employee;
    }
}



//        Employee employee = new Employee();
//        employee.setName("Andrei M");
//        employee.setHireDate(LocalDate.now());
//        employee.setDepartment(department);
//        EmployeeDao employeeDao = new EmployeeDao();
//        employeeDao.createEntity(employee);