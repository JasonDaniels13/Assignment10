package com.jasond.service;

import com.jasond.domain.employee.Employee;
import com.jasond.factory.employee.EmployeeFactory;
import com.jasond.repository.EmployeeRepository;
import com.jasond.repository.employee.impl.EmployeeRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

public class EmployeeServiceTest {

    private EmployeeRepository repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.getEmployee("Amanda", "Daniels");
    }


    @Test
    public void d_getAll() {
        Collection<Employee> employees = this.repository.getAll();
        System.out.println("In getAll, all = " + employees);
    }
}