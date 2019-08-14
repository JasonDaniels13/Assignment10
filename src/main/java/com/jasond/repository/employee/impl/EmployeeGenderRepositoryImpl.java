package com.jasond.repository.employee.impl;



import com.jasond.domain.employee.EmployeeGender;
import com.jasond.repository.EmployeeGenderRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository {
    private static EmployeeGenderRepositoryImpl repository = null;
    private Map<String, EmployeeGender> map = new HashMap();

    public static EmployeeGenderRepositoryImpl getRepository(){
        if (repository == null) repository = new EmployeeGenderRepositoryImpl();
        return repository;
    }


    @Override
    public Collection<EmployeeGender> getAll() {
        return map.values();
    }

    @Override
    public EmployeeGender create(String s, EmployeeGender employeeGender) {
        map.put(s, employeeGender);
        return employeeGender;
    }

    @Override
    public EmployeeGender update(String s, EmployeeGender employeeGender) {
        if (map.containsKey(s)) {
            map.remove(s);
        }

        map.put(s, employeeGender);

        return employeeGender;
    }

    @Override
    public EmployeeGender delete(String s) {
        return  map.remove(s);
    }

    @Override
    public EmployeeGender read(String id) {
        return map.get(id);
    }
}
