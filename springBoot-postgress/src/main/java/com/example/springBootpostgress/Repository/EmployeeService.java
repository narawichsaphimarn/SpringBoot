package com.example.springBootpostgress.Repository;

import java.util.List;

import com.example.springBootpostgress.Model.Employee;

public interface EmployeeService {
    List<Employee> findAll();

    void insertEmployee(Employee emp);

    void updateEmployee(Employee emp);

    void executeUpdateEmployee(Employee emp);

    void deleteEmployee(Employee emp);

}