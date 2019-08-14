package com.jasond.controller.employee;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeControllerTest {

    private EmployeeController employeeController;

    @Before
    public void setUp() throws Exception {
        employeeController = new EmployeeController();
    }

    @Test
    public void create() {
        employeeController.create("Happy","Gillmore",1,9999);
    }
}