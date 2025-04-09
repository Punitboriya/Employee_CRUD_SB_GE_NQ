package com.jsp.service;

import com.jsp.entities.Employee;

import java.util.List;

public interface EmployeeService {

    Employee create(Employee employee);

    List<Employee> getAll();

    Employee getById(int id);

    Employee update(int id,Employee employee);

    void delete(int id);

//    List<Employee> getByName(String name);
}
