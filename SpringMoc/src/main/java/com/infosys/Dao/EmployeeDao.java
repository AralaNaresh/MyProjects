package com.infosys.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.infosys.entity.Employee;

@Configuration
public class EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Integer save(Employee employee) {

		int count = jdbcTemplate.update("insert into employee values(?,?,?)", employee.getEno(), employee.getName(),
				employee.getSalary());
		return count;
	}

}
