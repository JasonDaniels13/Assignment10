package com.jasond.repository;


import com.jasond.domain.employee.EmployeeGender;


import java.util.Collection;

public interface EmployeeGenderRepository extends IRepository<String, EmployeeGender> {

    Collection<EmployeeGender> getAll();
}
