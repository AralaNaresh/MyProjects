package com.infosys.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.infosys.entity.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    public int   saveEmployee(Employee employee) {
    	
    	String sql="insert into employee values (?,?,?)";
    	int count = jdbcTemplate.update(sql, employee.getEno(),employee.getName(),employee.getSalary());
    	
		return count;
    	
    	
    }
}
