package com.jasond.repository.demography.impl;


import com.jasond.domain.demography.Gender;
import com.jasond.repository.GenderRepository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GenderRepositoryImpl implements GenderRepository {
    private static GenderRepositoryImpl repository = null;
    private Map<String, Gender> map = new HashMap();

    public static GenderRepositoryImpl getRepository(){
        if (repository == null) repository = new GenderRepositoryImpl();
        return repository;
    }


    @Override
    public Collection<Gender> getAll() {
        return map.values();
    }

    @Override
    public Gender create(String s, Gender gender) {
        map.put(s, gender);
        return gender;
    }

    @Override
    public Gender update(String s, Gender gender) {
        if (map.containsKey(s)) {
            map.remove(s);
        }

        map.put(s, gender);

        return gender;
    }

    @Override
    public Gender delete(String s) {
        return  map.remove(s);
    }

    @Override
    public Gender read(String id) {
        return map.get(id);
    }
}
