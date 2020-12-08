package com.bp.demo01.controller;

import com.bp.demo01.bean.Department;
import com.bp.demo01.bean.Employee;
import com.bp.demo01.service.DepartmentService;
import com.bp.demo01.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/employee")
    public String employee(ModelMap modelMap,Integer id){
        if(id==null){
            List<Employee> employees=employeeService.selectAll();
            modelMap.put("employees",employees);

        }else{
            List<Employee> employees=employeeService.selectId(id);
            modelMap.put("employees",employees);
        }
        modelMap.put("deptment_id",id);

        List<Department> departments=departmentService.getAll();
        modelMap.put("departments",departments);
        return "admin";
    }

    @GetMapping("/addInf")
    public String saveEmployee(ModelMap modelMap,Integer id, String name, Integer age,String team,Integer deptment_id){
        employeeService.saveEmployee(id,name,age,team,deptment_id);

        List<Department> departments=departmentService.getAll();
        modelMap.put("departments",departments);

        return "admin";
    }

    @GetMapping("/del")
    public String delete(ModelMap modelMap,Integer id){
        employeeService.deleteId(id);

        return "redirect:/admin";
    }

    @GetMapping("/updateAll")
    public String update(ModelMap modelMap,Integer id,
                         String name,
                         Integer age,
                         String team,
                         Integer deptment_id){
        employeeService.updateAll(id,name,age,team,deptment_id);
        List<Department> departments=departmentService.getAll();
        modelMap.put("departments",departments);

        return "redirect:/employee?id="+ deptment_id;
    }

    @GetMapping("/updateAll1")
    public String update(ModelMap modelMap,Integer id){
        List<Department> departments=departmentService.getAll();
        Employee employees=employeeService.selectLittle(id);
        modelMap.put("employees",employees);
        modelMap.put("departments",departments);
        return "update";
    }
}
