package com.infosys.SpringMoc;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.Service.EmployeeService;
import com.infosys.entity.Employee;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A eno ");
		int eno = scanner.nextInt();

		System.out.println("Enter A NAme");
		String name = scanner.next();

		System.out.println("Enter A salary");
		Double salary = scanner.nextDouble();

		Employee employee = new Employee();
		employee.setEno(eno);
		employee.setName(name);
		employee.setSalary(salary);

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(com.infosys.Util.MocUtil.class);
		EmployeeService service = container.getBean(EmployeeService.class);
		double val = service.calTax(employee);
		
	System.out.println(val);
		container.close();

	}
}
