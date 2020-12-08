package com.bp.demo01.service.impl;

import com.bp.demo01.bean.Department;
import com.bp.demo01.dao.DepartmentMapper;
import com.bp.demo01.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    @Override
    public List<Department> getById(int id){
        return departmentMapper.getById(id);
    }

    public List<Department> getAll(){
        return departmentMapper.getAll();
    }
}
