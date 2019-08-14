package com.jasond.service;

import com.jasond.domain.demography.Gender;
import com.jasond.factory.demography.GenderFactory;
import com.jasond.repository.GenderRepository;
import com.jasond.repository.demography.impl.GenderRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class GenderServiceTest {

    private GenderRepository repository;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.getGender("Male");
    }


    @Test
    public void d_getAll() {
        Collection<Gender> gender = this.repository.getAll();
        System.out.println("In getAll, all = " + gender);
    }
}