package com.jasond.repository.demography.impl;

import com.jasond.domain.demography.Gender;
import com.jasond.domain.demography.Race;
import com.jasond.repository.RaceRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RaceRepositoryImpl implements RaceRepository {
    private static RaceRepositoryImpl repository = null;
    private Map<String, Race> map = new HashMap();

    public static RaceRepositoryImpl getRepository(){
        if (repository == null) repository = new RaceRepositoryImpl();
        return repository;
    }


    @Override
    public Collection<Race> getAll() {
        return map.values();
    }

    @Override
    public Race create(String s, Race race) {
        map.put(s, race);
        return race;
    }

    @Override
    public Race update(String s, Race race) {
        if (map.containsKey(s)) {
            map.remove(s);
        }

        map.put(s, race);

        return race;
    }

    @Override
    public Race delete(String s) {
        return  map.remove(s);
    }

    @Override
    public Race read(String id) {
        return map.get(id);
    }
}
