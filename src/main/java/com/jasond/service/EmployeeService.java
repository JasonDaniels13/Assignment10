package com.jasond.service;



import com.jasond.domain.employee.Employee;

import java.util.Collection;

public interface EmployeeService extends IService<String, Employee> {
    Collection<Employee> getAll();
}
