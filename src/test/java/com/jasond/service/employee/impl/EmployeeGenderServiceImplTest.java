package com.jasond.service.employee.impl;

import com.jasond.domain.employee.EmployeeGender;
import com.jasond.factory.employee.EmployeeGenderFactory;
import com.jasond.repository.employee.impl.EmployeeGenderRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class EmployeeGenderServiceImplTest {
    private EmployeeGenderServiceImpl service = null;
    private EmployeeGenderRepositoryImpl repository;
    private EmployeeGender employeeGender;

    private EmployeeGender getEmployeeGender(){
        return  this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
        this.employeeGender = EmployeeGenderFactory.getEmployeeGender("3698");

        repository.create(this.employeeGender.getGenderId(), this.employeeGender);
    }

    @Test
    public void create() {
        EmployeeGender employeeGender = new EmployeeGender.Builder()
                .genderId("1")
                .employeeNumber("3698")
                .build();

        EmployeeGender created = this.repository.create(employeeGender.getGenderId(), employeeGender);
        System.out.println("\n" + "In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, employeeGender);
    }

    @Test
    public void update() {
        String newId = "Id updated";
        EmployeeGender updated = new EmployeeGender.Builder().copy(getEmployeeGender()).genderId(newId).build();
        System.out.println("\n" + "In update, updated = " + updated);
        Assert.assertSame(newId, updated.getGenderId());

    }

    @Test
    public void delete() {
        EmployeeGender employeeGender = getEmployeeGender();
        System.out.println("\n" + "In Delete, delete = " + employeeGender);
        this.repository.delete(this.employeeGender.getGenderId());
        getAll();
        Assert.assertNotNull(employeeGender);
    }

    @Test
    public void read() {
        EmployeeGender employeeGender = getEmployeeGender();
        EmployeeGender read = this.repository.read(employeeGender.getGenderId());
        System.out.println("\n" + "In Read, read = "+ employeeGender);
        Assert.assertSame(employeeGender, read);
    }

    @Test
    public void getAll() {
        Collection<EmployeeGender> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}

