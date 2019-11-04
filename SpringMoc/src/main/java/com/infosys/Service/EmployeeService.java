package com.infosys.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.infosys.Dao.EmployeeDao;
import com.infosys.entity.Employee;

@Configuration
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
		public double calTax(Employee employee) {
			
			Double salary = employee.getSalary();
			return salary;
			
	}

}
