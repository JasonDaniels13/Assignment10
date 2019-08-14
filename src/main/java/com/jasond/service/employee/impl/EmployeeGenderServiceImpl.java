package com.jasond.service.employee.impl;



import com.jasond.domain.employee.EmployeeGender;
import com.jasond.repository.EmployeeGenderRepository;
import com.jasond.repository.employee.impl.EmployeeGenderRepositoryImpl;
import com.jasond.service.EmployeeGenderService;

import java.util.Collection;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {


    private static EmployeeGenderServiceImpl service = null;
    private EmployeeGenderRepository repository;

    private EmployeeGenderServiceImpl(){
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
    }
    public static EmployeeGenderServiceImpl getService(){
        if (service == null) service = new EmployeeGenderServiceImpl();
        return service;
    }

    @Override
    public EmployeeGender create(String s, EmployeeGender employeeGender) {
        return this.repository.create(s, employeeGender);
    }

    @Override
    public EmployeeGender update(String s, EmployeeGender employeeGender) {
        return this.repository.update(s, employeeGender);
    }

    @Override
    public EmployeeGender delete(String id) {
        return this.repository.delete(id);
    }

    @Override
    public EmployeeGender read(String id) {
        return this.repository.read(id);
    }

    @Override
    public Collection<EmployeeGender> getAll() {
        return this.repository.getAll();
    }
}
