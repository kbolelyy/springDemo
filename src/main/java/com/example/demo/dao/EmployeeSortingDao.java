package com.example.demo.dao;

import com.example.demo.dto.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeSortingDao extends PagingAndSortingRepository<Employee, Long> {

}
