package com.jasond.repository.employee.impl;

import com.jasond.domain.employee.Employee;
import com.jasond.factory.employee.EmployeeFactory;
import com.jasond.repository.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
import java.util.Collection;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRepositoryImplTest {

    private EmployeeRepository employeeRepository;
    private Employee employee;

    private Employee getSavedEmployee(){
        Collection<Employee> savedEmployees = this.employeeRepository.getAll();
        return savedEmployees.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.employeeRepository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.getEmployee("Aldado", "Dampies");

        employeeRepository.create(this.employee.getEmployeeNumber(), this.employee);
    }

    @Test
    public void create() throws Exception {
        Employee employee = new Employee.Builder()
                .employeeNumber("3698")
                .employeeFirstName("Aldado")
                .employeeLastName("Dampies")
                .build();
        Employee created = this.employeeRepository.create(employee.getEmployeeNumber(), employee);
        System.out.println("\n" + "In create, created = " + created);
        d_getAll();
        Assert.assertEquals(created, employee);
    }

    @Test
    public void d_getAll() {
        Collection<Employee> all = this.employeeRepository.getAll();
        System.out.println("\nIn getAll, all = " + all);
    }

    @Test
    public void update() {
        String newName = "New employee name created";
        Employee employee = new Employee.Builder().copy(getSavedEmployee()).employeeFirstName(newName).build();
        System.out.println("\nIn update, about to be updated = " + employee);
        Employee updated = this.employeeRepository.update(employee.getEmployeeNumber(), employee);
        System.out.println("\nIn update, updated = " + updated);
        Assert.assertSame(newName, updated.getEmployeeFirstName());
        d_getAll();

    }

    @Test
    public void delete() {
        Employee savedEmployee = getSavedEmployee();
        System.out.println("\n" + "In Delete, about to be deleted = " + employee);
        this.employeeRepository.delete(savedEmployee.getEmployeeNumber());
        System.out.println("\n" + "In Delete, Employee deleted: ");
        d_getAll();

    }

    @Test
    public void read() {
        Employee savedEmployee = getSavedEmployee();
        System.out.println("\nIn Read, employee number = " + savedEmployee.getEmployeeNumber());
        Employee read = this.employeeRepository.read(savedEmployee.getEmployeeNumber());
        System.out.println("\nIn Read, read = " + read);
        d_getAll();

    }
}