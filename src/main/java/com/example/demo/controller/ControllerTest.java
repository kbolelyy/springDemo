package com.example.demo.controller;


import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
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


    @RequestMapping(value = "/employeeSort", method = RequestMethod.GET)
    public String employeeSort(Model model, HttpServletRequest request){

        int page = Integer.parseInt(request.getParameter("page"));
        int size = Integer.parseInt(request.getParameter("size"));
        String field = request.getParameter("field");

        model.addAttribute("pageEmployee", employeeService.getPageEmployeeResult(page, size, field));
        model.addAttribute("employeeCount", employeeService.getCountEmployee());
        model.addAttribute("page", page);
        model.addAttribute("field", field);


        return "employeeSort";
    }

    @RequestMapping(value = "/employeeCount", method = RequestMethod.GET)
    public Model getEmployeeCount(Model model){
        model.addAttribute("employeeCount", employeeService.getCountEmployee());
        return model;
    }

}
