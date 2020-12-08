package com.bp.demo01.controller;

import com.bp.demo01.bean.Department;
import com.bp.demo01.bean.Employee;
import com.bp.demo01.dao.DepartmentMapper;
import com.bp.demo01.service.DepartmentService;
import com.bp.demo01.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/admin")
    public String admin(ModelMap modelMap){

        List<Department> departments=departmentService.getAll();
        modelMap.put("departments",departments);
        return "admin";
    }

    @GetMapping("/addInf1")
    public String add(ModelMap modelMap){
        List<Department> departments=departmentService.getAll();
        modelMap.put("departments",departments);
        return "add";
    }


}
