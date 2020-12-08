package com.bp.demo01;

import com.bp.demo01.dao.DepartmentMapper;
import com.bp.demo01.dao.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo01ApplicationTests {
	@Autowired
	DepartmentMapper departmentMapper;
	@Autowired
	EmployeeMapper employeeMapper;
	@Test
	void contextLoads() {
		System.out.println(departmentMapper.getById(1));
		System.out.println(employeeMapper.selectId(1));
		employeeMapper.deleteId(6);
	}

}
