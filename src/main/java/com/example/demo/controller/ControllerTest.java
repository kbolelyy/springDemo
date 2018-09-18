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
        if (result.hasErrors()) {
            return "error";
        }
        employeeService.createEmployee(employee);
        model.addAttribute("employeeEdit", employee);

        return "editViewEmployee";
    }

    /*create employee*/
    @RequestMapping(value = "/createNewEmployee", method = RequestMethod.GET)
    public String createEmployeeView(Model model){
        model.addAttribute("employee", new Employee());
        return "createEmployee";
    }



    /*update employee*/
    @RequestMapping(value = "/editEmployee/{id}", method = RequestMethod.GET)
    public String editViewEmployee(@PathVariable Long id, Model model) {
        Employee employee = employeeService.findById(id);
        model.addAttribute("employeeEdit", employee);
        return "editViewEmployee";
    }



    /*delete employee*/
    @RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.GET)
    public String deleteEmployee(@PathVariable Long id){
        employeeService.removeEmployee(id);
        return "redirect:/employeeSort/1/10/id";
    }

    /*pagination*/
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
