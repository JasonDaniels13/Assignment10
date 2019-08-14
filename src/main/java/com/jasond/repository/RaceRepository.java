package com.jasond.repository;


import com.jasond.domain.demography.Race;


import java.util.Collection;

public interface RaceRepository extends IRepository<String, Race> {

    Collection<Race> getAll();
}

