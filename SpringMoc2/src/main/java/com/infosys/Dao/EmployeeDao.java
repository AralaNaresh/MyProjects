package com.infosys.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.infosys.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int saveEmployee(Employee employee) {

		String sql = "insert into employee values (?,?,?)";
		int count = jdbcTemplate.update(sql, employee.getEno(), employee.getName(), employee.getSalary());

		return count;

	}

	public List<Employee> finfAll() {

		String sql = "select * from employee";

		List<Employee> query = jdbcTemplate.query(sql,

				new RowMapper<Employee>() {

					@Override
					public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

						Employee employee = new Employee();
						employee.setEno(rs.getInt("Id"));
						employee.setName(rs.getString("name"));
						employee.setSalary(rs.getDouble("salary"));

						return employee;
					}

				});

		return query;

	}
}
