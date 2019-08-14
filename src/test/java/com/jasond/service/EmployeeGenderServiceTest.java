package com.jasond.service;

import com.jasond.domain.employee.EmployeeGender;
import com.jasond.factory.employee.EmployeeGenderFactory;
import com.jasond.repository.EmployeeGenderRepository;
import com.jasond.repository.employee.impl.EmployeeGenderRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class EmployeeGenderServiceTest {

    private EmployeeGenderRepository repository;
    private EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
        this.employeeGender = EmployeeGenderFactory.getEmployeeGender("9998");
    }


    @Test
    public void d_getAll() {
        Collection<EmployeeGender> employeeGender = this.repository.getAll();
        System.out.println("In getAll, all = " + employeeGender);
    }
}