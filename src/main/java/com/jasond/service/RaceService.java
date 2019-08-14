package com.jasond.service;


import com.jasond.domain.demography.Race;


import java.util.Collection;

public interface RaceService extends IService<String, Race> {
    Collection<Race> getAll();
}
