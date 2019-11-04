package com.infosys.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.infosys.entity.Employee;

@Repository
public class EmployeeDao extends JdbcDaoSupport {

	
	@Autowired
	 public EmployeeDao(DataSource dataSource){
		 this.setDataSource(dataSource);
		
	}
	
	public int saveEmployee(Employee employee) {

		String sql = "insert into employee values (?,?,?)";
		
		int count = getJdbcTemplate().update(sql, employee.getEno(),employee.getName(),employee.getSalary());
		
		return count;

	}

	
	
}
