package com.infosys.SpringORMJPA;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.Service.EmployeeService;
import com.infosys.Util.MocUtil;
import com.infosys.entity.Employee;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MocUtil.class);

		EmployeeService employeeService = container.getBean(EmployeeService.class);
		employeeService.sendRecord(new Employee(2, "jessy", 20000d));
		container.close();
	}

}
