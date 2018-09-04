package com.example.demo.service;

import com.example.demo.dto.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    List<Employee> getPageEmployeeResult(int page, int limit, String field);

    long getCountEmployee();

}
