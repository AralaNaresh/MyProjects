package com.infosys.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.Dao.EmployeeDAO;
import com.infosys.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Transactional
	public void send(Employee employee) {
		employeeDAO.Save(employee);
	}

}
