package com.bp.demo01.service;

import com.bp.demo01.bean.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getById(int id);
    List<Department> getAll();
}
