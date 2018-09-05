package com.example.demo.controller;


import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ControllerTest {


    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute("employee") Employee employee, BindingResult result, ModelMap model) {
        employeeService.createEmployee(employee);

        model.addAttribute("employee", employee);
        if (result.hasErrors()) {
            return "error";
        }
        return "openViewEmployee";
    }

    @RequestMapping(value = "/openViewEmployee/{id}", method = RequestMethod.GET)
    public String openViewEmployee(@PathVariable Long id, Model model) {
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        return "openViewEmployee";
    }


    @RequestMapping(value = "/employeeSort/{page}/{size}/{field}", method = RequestMethod.GET)
    public String employeeSort(Model model, @PathVariable int page, @PathVariable int size, @PathVariable String field) {
        model.addAttribute("pageEmployee", employeeService.getPageEmployeeResult(page, size, field));
        model.addAttribute("employeeCount", employeeService.getCountEmployee());
        model.addAttribute("page", page);
        model.addAttribute("field", field);
        model.addAttribute("size", size);
        return "employeeSort";
    }

}
