package com.jsp.controller;

import com.jsp.entities.Employee;
import com.jsp.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        Employee createdEmployee = employeeService.create(employee);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAll() {
        List<Employee> employeeList = employeeService.getAll();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getById(@PathVariable int id) {
        Employee employee = employeeService.getById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmp(@PathVariable int id, @RequestBody Employee employee) {
        Employee updated = employeeService.update(id, employee);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmp(@PathVariable int id) {
        employeeService.delete(id);
        return ResponseEntity.ok("Employee deleted of id :" + id);
    }

//    @GetMapping("/name/{name}")
//    public ResponseEntity<List<Employee>> getByName (@PathVariable String name){
//        List<Employee> empByName = employeeService.getByName(name);
//        return new ResponseEntity<>(empByName,HttpStatus.OK);
//    }
}
