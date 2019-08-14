package com.jasond.service.demography.impl;

import com.jasond.domain.demography.Gender;
import com.jasond.factory.demography.GenderFactory;
import com.jasond.repository.demography.impl.GenderRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class GenderServiceImplTest {

    private GenderServiceImpl service = null;
    private GenderRepositoryImpl repository;
    private Gender gender;

    private Gender getGender(){
        return  this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.getGender("Male");

        repository.create(this.gender.getId(), this.gender);
    }

    @Test
    public void create() {
        Gender gender = new Gender.Builder()
                .id("1")
                .descr("Male")
                .build();

        Gender created = this.repository.create(gender.getId(), gender);
        System.out.println("\n" + "In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, gender);
    }

    @Test
    public void update() {
        String newId = "Id updated";
        Gender updated = new Gender.Builder().copy(getGender()).id(newId).build();
        System.out.println("\n" + "In update, updated = " + updated);
        Assert.assertSame(newId, updated.getId());

    }

    @Test
    public void delete() {
        Gender gender = getGender();
        System.out.println("\n" + "In Delete, delete = " + gender);
        this.repository.delete(this.gender.getId());
        getAll();
        Assert.assertNotNull(gender);
    }

    @Test
    public void read() {
        Gender gender = getGender();
        Gender read = this.repository.read(gender.getId());
        System.out.println("\n" + "In Read, read = "+ gender.getId());
        Assert.assertSame(gender, read);
    }

    @Test
    public void getAll() {
        Collection<Gender> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}