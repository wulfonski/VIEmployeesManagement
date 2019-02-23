package com.sda.model;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="employees")
public class Employee {


    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 40)
    private String name;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name ="department_id", nullable=false)
    private Department department;

    @Column(name = "hire_date" )
    private LocalDate hireDate;

    @ManyToOne(cascade={CascadeType.MERGE})
    @JoinColumn(name="manager_id")
    private Employee manager;

    @OneToMany(mappedBy="manager")
    private Set<Employee> subordinates = new HashSet<Employee>();

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Set<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(Set<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
