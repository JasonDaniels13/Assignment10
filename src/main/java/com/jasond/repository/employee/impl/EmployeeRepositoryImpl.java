package com.jasond.repository.employee.impl;


import com.jasond.domain.employee.Employee;
import com.jasond.repository.EmployeeRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static EmployeeRepositoryImpl repository = null;
    private Map<String, Employee> map = new HashMap();

    public static EmployeeRepositoryImpl getRepository() {
        if (repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }


    @Override
    public Collection<Employee> getAll() {
        return map.values();
    }

    @Override
    public Employee create(String s, Employee employee) {
        map.put(s, employee);
        return employee;
    }

    @Override
    public Employee update(String s, Employee employee) {
        if (map.containsKey(s)) {
            map.remove(s);
        }

        map.put(s, employee);

        return employee;
    }

    @Override
    public Employee delete(String s) {
        return map.remove(s);
    }

    @Override
    public Employee read(String id) {
        return map.get(id);
    }
}
