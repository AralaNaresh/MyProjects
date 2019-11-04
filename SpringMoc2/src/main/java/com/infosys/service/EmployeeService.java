package com.infosys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.Dao.EmployeeDao;
import com.infosys.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	public int caltax(Employee employee) {
		
		int count = employeeDao.saveEmployee(employee);
		return count;
	}
	
	 public List<Employee> RecordsAll() {
		 List<Employee> total = employeeDao.finfAll();
		
		return total;
	 }
}
