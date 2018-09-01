package com.example.demo.service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao dao;

    @Override
    public List<Employee> getAllEmployee() {

        List<Employee> employeeList = new ArrayList<>();
        dao.findAll().forEach(employeeList::add);
        return employeeList;
    }
}
