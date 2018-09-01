package com.example.demo.controller;


import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class ControllerTest {


    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String employee(Model model){

        List<Employee> allEmployee = employeeService.getAllEmployee();
        String message = "here should be employee list";
        model.addAttribute("messageHello", message);
        model.addAttribute("employeeList", allEmployee);
        return "employee";

    }

}
