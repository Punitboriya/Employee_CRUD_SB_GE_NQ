package com.jsp.serviceImpl;

import com.jsp.exception.EmployeeNotFoundException;
import com.jsp.repository.EmployeeRepository;
import com.jsp.entities.Employee;
import com.jsp.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
//this  is Service
@Service
public class EmplyeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmplyeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getById(int id) {
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found with id : " + id));
    }

    @Override
    public Employee update(int id, Employee employee) {
        Employee existingEmployee = getById(id);
        existingEmployee.setName(employee.getName());
        existingEmployee.setPhone(employee.getPhone());
        return employeeRepository.save(existingEmployee);
    }

    @Override
    public void delete(int id) {
        Employee existingEmployee = getById(id);
        employeeRepository.delete(existingEmployee);

    }

//    @Override
//    public List<Employee> getByName(String name) {
//        return employeeRepository.findByName(name);
//    }
}
