package com.bp.demo01.dao;

import java.util.List;

import com.bp.demo01.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EmployeeMapper {
   List<Employee> selectId(int id);
   Employee selectLittle(Integer id);
   List<Employee> selectAll();
   void saveEmployee(@Param("Id")Integer id,
                     @Param("Name")String name,
                     @Param("Age")Integer age,
                     @Param("Team")String team,
                     @Param("deptment_id")Integer deptment_id);
   void deleteId(@Param("id")Integer id);
   void updateAll(@Param("id")Integer id,
                  @Param("name")String name,
                  @Param("age")Integer age,
                  @Param("team")String team,
                  @Param("deptment_id")Integer deptment_id);
}
