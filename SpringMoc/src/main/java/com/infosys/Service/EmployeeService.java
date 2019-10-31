package com.infosys.Service;

import org.springframework.context.annotation.Configuration;

import com.infosys.Dao.employeeDao;
import com.infosys.entity.Employee;

@Configuration
public class EmployeeService {
	
	public double cal(Employee employee) {
		
	//ninna denilo salary logic rayamannaru today display chesesadu 
		
		Double salary = employee.getSalary();
		
		employeeDao dao = new employeeDao();
		
		dao.save(employee);
		
		return salary;
		
		
	}

}
