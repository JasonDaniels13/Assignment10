package com.jasond.repository.demography.impl;

import com.jasond.domain.demography.Gender;
import com.jasond.factory.demography.GenderFactory;
import com.jasond.repository.GenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Collection;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderRepositoryImplTest {

    private GenderRepository genderRepository;
    private Gender gender;

    private Gender getSavedGender(){
        Collection<Gender> savedGenders = this.genderRepository.getAll();
        return savedGenders.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.genderRepository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.getGender("Male");

        genderRepository.create(this.gender.getId(), this.gender);
    }

    @Test
    public void create() throws Exception {
        Gender gender = new Gender.Builder()
                .id("2")
                .descr("Female")
                .build();
        Gender created = this.genderRepository.create(gender.getId(), gender);
        System.out.println("\n" + "In create, created = " + created);
        d_getAll();
        Assert.assertEquals(created, gender);
    }

    @Test
    public void d_getAll() {
        Collection<Gender> all = this.genderRepository.getAll();
        System.out.println("\nIn getAll, all = " + all);
    }

    @Test
    public void update() {
        String newDescr = "New gender created";
        Gender gender = new Gender.Builder().copy(getSavedGender()).descr(newDescr).build();
        System.out.println("\nIn update, about to be updated = " + gender);
        Gender updated = this.genderRepository.update(gender.getId(), gender);
        System.out.println("\nIn update, updated = " + updated);
        Assert.assertSame(newDescr, updated.getDescr());
        d_getAll();

    }

    @Test
    public void delete() {
        Gender savedGender = getSavedGender();
        System.out.println("\n" + "Deleted = " + gender);
        this.genderRepository.delete(savedGender.getId());
        System.out.println("\n" + "Deleted");
        d_getAll();
        Assert.assertSame(gender, savedGender);
    }

    @Test
    public void read() {
        Gender savedGender = getSavedGender();
        System.out.println("\nIn read, gender id = " + savedGender.getId());
        Gender read = this.genderRepository.read(savedGender.getId());
        System.out.println("\nIn read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedGender, read);
    }
}