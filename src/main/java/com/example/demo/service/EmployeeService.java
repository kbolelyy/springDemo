package com.example.demo.service;

import com.example.demo.dto.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    List<Employee> getPageEmployeeResult(int page, int limit, String field);

    Employee findById(Long id);

    long getCountEmployee();

    void createEmployee(Employee employee);

    void removeEmployee(Long id);

}
