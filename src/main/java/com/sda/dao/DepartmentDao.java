package com.sda.dao;

import com.sda.model.Department;
import com.sda.model.Employee;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class DepartmentDao extends GenericDao<Department> {

    public List<Department> getAllDepartments() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("FROM com.sda.model.Department");

        List<Department> allDepartments = query.getResultList();

        transaction.commit();
        session.close();
        return allDepartments;
    }
}
