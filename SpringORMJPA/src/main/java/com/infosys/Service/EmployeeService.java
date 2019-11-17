package com.infosys.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.DAO.EmployeeDao;
import com.infosys.entity.Employee;

@Service
public class EmployeeService {
 
	@Autowired
	private EmployeeDao employeeDao;
	
	public void sendRecord(Employee employee) {
		employeeDao.save(employee);
		
	}
	
}
