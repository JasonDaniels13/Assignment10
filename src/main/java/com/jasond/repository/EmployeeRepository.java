package com.jasond.repository;


import com.jasond.domain.employee.Employee;


import java.util.Collection;

public interface EmployeeRepository extends IRepository<String, Employee> {

    Collection<Employee> getAll();
}
