package com.jasond.service.demography.impl;


import com.jasond.domain.demography.Gender;
import com.jasond.repository.GenderRepository;
import com.jasond.repository.demography.impl.GenderRepositoryImpl;
import com.jasond.service.GenderService;

import java.util.Collection;

public class GenderServiceImpl implements GenderService {


    private static GenderServiceImpl service = null;
    private GenderRepository repository;

    private GenderServiceImpl(){
        this.repository = GenderRepositoryImpl.getRepository();
    }
    public static GenderServiceImpl getService(){
        if (service == null) service = new GenderServiceImpl();
        return service;
    }

    @Override
    public Gender create(String s, Gender gender) {
        return this.repository.create(s, gender);
    }

    @Override
    public Gender update(String s, Gender gender) {
        return this.repository.update(s, gender);
    }

    @Override
    public Gender delete(String id) {
        return this.repository.delete(id);
    }

    @Override
    public Gender read(String id) {
        return this.repository.read(id);
    }

    @Override
    public Collection<Gender> getAll() {
        return this.repository.getAll();
    }
}
