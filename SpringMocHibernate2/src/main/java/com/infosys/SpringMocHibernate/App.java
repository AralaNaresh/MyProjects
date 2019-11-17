package com.infosys.SpringMocHibernate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.entity.Employee;
import com.infosys.service.EmployeeService;
import com.infosys.util.MocUtil;

public class App 
{
	public static void main( String[] args )
    {
    	 
    	 Employee employee = new Employee(6,"rama",40000d);  	
    	 AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MocUtil.class);
    	   EmployeeService employeeService = container.getBean(EmployeeService.class);
    	    employeeService.send(employee);
    	  
    	 container.close();
    	 
    }
}
