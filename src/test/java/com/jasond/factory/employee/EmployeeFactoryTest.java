package com.jasond.factory.employee;

import com.jasond.domain.employee.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    private String EmployeeTest;

    @Before
    public void setUp() throws Exception {
        this.EmployeeTest = "EmployeeTest";
    }

    @Test
    public void buildEmployee() {
        Employee employee = EmployeeFactory.getEmployee("Jackie", "Lontie");
        System.out.println(employee);
        Assert.assertNotNull(employee.getEmployeeNumber());
    }
}