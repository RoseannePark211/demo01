package com.bp.demo01.service.impl;

import com.bp.demo01.bean.Employee;
import com.bp.demo01.dao.EmployeeMapper;
import com.bp.demo01.service.EmployeeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceimpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> selectId(int id){
        return employeeMapper.selectId(id);
    }

    @Override
    public Employee selectLittle(Integer id){
        return employeeMapper.selectLittle(id);
    }

    @Override
    public List<Employee> selectAll(){
        return employeeMapper.selectAll();
    }

    @Override
    public void saveEmployee(Integer id, String name, Integer age,String team,Integer deptment_id){
        employeeMapper.saveEmployee(id,name,age,team,deptment_id);
    }

    @Override
    public void deleteId(Integer id) {
        employeeMapper.deleteId(id);
    }

    @Override
    public void updateAll(Integer id, String name, Integer age,String team,Integer deptment_id){
        employeeMapper.updateAll(id,name,age,team,deptment_id);
    }
}
