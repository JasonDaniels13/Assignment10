package com.jasond.service;


import com.jasond.domain.demography.Gender;


import java.util.Collection;

public interface GenderService extends IService<String, Gender> {
    Collection<Gender> getAll();
}
