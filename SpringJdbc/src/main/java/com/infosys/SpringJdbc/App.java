package com.infosys.SpringJdbc;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.infosys.springUtil.Employee;
import com.infosys.springUtil.EmployeeRowMapper;

public class App 
{
    public static void main( String[] args )
    {
 AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MOCUtil.class);
 JdbcTemplate template = container.getBean(JdbcTemplate.class);
 //template.update("insert into employee values(?,?,?)" ,2,"jessy",3000d);
  // template.update("update employee set ID=2 where SALARY=55555");
          List<Employee> list = template.query("select * from employee",new EmployeeRowMapper());
          
//          for (Employee employee : list) {
//			System.out.println(employee);
          
//		}
           
           list.forEach(employee -> System.out.println(employee));
          
           container.close();
    }
}
