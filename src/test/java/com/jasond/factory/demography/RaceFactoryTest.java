package com.jasond.factory.demography;

import com.jasond.domain.demography.Race;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RaceFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getRace() {
    }

    @Test
    public void buildGender() {
        Race race = RaceFactory.getRace("White");
        Assert.assertEquals("White", race.getDescr());
        Assert.assertNotNull(race.getId());
        System.out.println(race);
        Assert.assertNotNull(race);

    }
}