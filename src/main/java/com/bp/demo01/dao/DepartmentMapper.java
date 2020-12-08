package com.bp.demo01.dao;

import com.bp.demo01.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DepartmentMapper {
	List<Department> getById(int id);
	List<Department> getAll();
}
