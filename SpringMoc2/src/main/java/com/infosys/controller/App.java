package com.infosys.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.entity.Employee;
import com.infosys.service.EmployeeService;
import com.infosys.util.MocUtil;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a name");
		int eno = scanner.nextInt();

		System.out.println("enter a name");
		String name = scanner.next();

		System.out.println("enter a salary");
		double salary = scanner.nextDouble();

		Employee employee = new Employee();
		employee.setEno(eno);
		employee.setName(name);
		employee.setSalary(salary);

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MocUtil.class);
		EmployeeService service = container.getBean(EmployeeService.class);
		int caltax = service.caltax(employee);
		System.out.println(caltax);
		List<Employee> recordsAll = service.RecordsAll();

		for (Employee totalrRecords: recordsAll) {
			
			System.out.println(totalrRecords);
		}
		

		container.close();
		scanner.close();
	}

}
