package com.jasond.factory.demography;

import com.jasond.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getGender() {
    }

    @Test
    public void buildGender() {
        Gender gender = GenderFactory.getGender("Male");
        Assert.assertEquals("Male", gender.getDescr());
        Assert.assertNotNull(gender.getId());
        System.out.println(gender);
        Assert.assertNotNull(gender);
    }
}