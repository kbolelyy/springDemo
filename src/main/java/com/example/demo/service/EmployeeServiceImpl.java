package com.example.demo.service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dao.EmployeeSortingDao;
import com.example.demo.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao dao;

    @Autowired
    private EmployeeSortingDao sortingDao;

    @Override
    public List<Employee> getAllEmployee() {

        List<Employee> employeeList = new ArrayList<>();
        dao.findAll().forEach(employeeList::add);
        return employeeList;
    }

    @Override
    public List<Employee> getPageEmployeeResult(int page, int limit, String field) {
        return sortingDao.findAll(PageRequest.of(page, limit, Sort.by(field).descending())).getContent();
    }

    @Override
    public Employee findById(Long id) {
        return dao.findById(id).orElseThrow(() -> new EntityNotFoundException("can`t find employye with id :" + id));
    }


    @Override
    public long getCountEmployee() {
        return dao.count();
    }

    @Override
    public void createEmployee(Employee employee) {
        dao.save(employee);
    }

    @Override
    public void removeEmployee(Long id) {
        dao.deleteById(id);
    }


}
