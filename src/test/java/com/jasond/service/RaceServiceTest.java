package com.jasond.service;

import com.jasond.domain.demography.Race;
import com.jasond.factory.demography.RaceFactory;
import com.jasond.repository.RaceRepository;
import com.jasond.repository.demography.impl.RaceRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class RaceServiceTest {

    private RaceRepository repository;
    private Race race;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.getRace("Colored");
    }


    @Test
    public void d_getAll() {
        Collection<Race> race = this.repository.getAll();
        System.out.println("In getAll, all = " + race);
    }
}