package com.jasond.repository;



import com.jasond.domain.demography.Gender;
import com.jasond.repository.IRepository;

import java.util.Collection;

public interface GenderRepository extends IRepository<String, Gender> {

    Collection<Gender> getAll();
}
