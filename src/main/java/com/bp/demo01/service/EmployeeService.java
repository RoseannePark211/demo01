package com.bp.demo01.service;

import com.bp.demo01.bean.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> selectId(int id);
    Employee selectLittle(Integer id);
    List<Employee> selectAll();
    void saveEmployee(Integer id,
                      String name,
                      Integer age,
                      String team,
                      Integer deptment_id);
    void deleteId(Integer id);
    void updateAll(Integer id,
                   String name,
                   Integer age,
                   String team,
                   Integer deptment_id);
}
