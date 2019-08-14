package com.jasond.service.demography.impl;


import com.jasond.domain.demography.Race;
import com.jasond.factory.demography.RaceFactory;
import com.jasond.repository.demography.impl.RaceRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;


public class RaceServiceImplTest {

    private RaceServiceImpl service = null;
    private RaceRepositoryImpl repository;
    private Race race;

    private Race getRace(){
        return  this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.getRace("Colored");

        repository.create(this.race.getId(), this.race);
    }

    @Test
    public void create() {
        Race race = new Race.Builder()
                .id("2222")
                .descr("White")
                .build();

        Race created = this.repository.create(race.getId(), race);
        System.out.println("\n" + "In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, race);
    }

    @Test
    public void update() {
        String newId = "Id updated";
        Race updated = new Race.Builder().copy(getRace()).id(newId).build();
        System.out.println("\n" + "In update, updated = " + updated);
        Assert.assertSame(newId, updated.getId());

    }

    @Test
    public void delete() {
        Race race = getRace();
        System.out.println("\n" + "In Delete, delete = " + race);
        this.repository.delete(this.race.getId());
        getAll();
        Assert.assertNotNull(race);
    }

    @Test
    public void read() {
        Race race1 = getRace();
        Race read = this.repository.read(race1.getId());
        System.out.println("\n" + "In Read, read = "+ race);
        Assert.assertNotSame(race, read);
    }

    @Test
    public void getAll() {
        Collection<Race> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}