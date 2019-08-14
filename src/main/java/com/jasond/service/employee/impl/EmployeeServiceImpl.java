package com.jasond.service.employee.impl;

import com.jasond.domain.employee.Employee;
import com.jasond.repository.EmployeeRepository;
import com.jasond.repository.employee.impl.EmployeeRepositoryImpl;
import com.jasond.service.EmployeeService;
import java.util.Collection;


public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl(){
        this.repository = EmployeeRepositoryImpl.getRepository();
    }
    public static EmployeeServiceImpl getService(){
        if (service == null) service = new EmployeeServiceImpl();
        return service;
    }

    @Override
    public Employee create(String s, Employee employee) {
        return this.repository.create(s, employee);
    }

    @Override
    public Employee update(String s, Employee employee) {
        return this.repository.update(s, employee);
    }

    @Override
    public Employee delete(String id) {
        return this.repository.delete(id);
    }

    @Override
    public Employee read(String id) {
        return this.repository.read(id);
    }

    @Override
    public Collection<Employee> getAll() {
        return this.repository.getAll();
    }
}
