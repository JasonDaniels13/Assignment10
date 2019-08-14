package com.jasond.service;


import com.jasond.domain.employee.EmployeeGender;


import java.util.Collection;

public interface EmployeeGenderService extends IService<String, EmployeeGender> {
    Collection<EmployeeGender> getAll();
}
