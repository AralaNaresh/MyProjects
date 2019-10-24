package com.spring.SpringJdbc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.Util.EmployeeResultSetExctractor;

public class App 
{

	public static void main( String[] args )
    {
      
    	 ApplicationContext containaer = new  AnnotationConfigApplicationContext(MocUtil.class);
    	   
    	  JdbcTemplate bean = containaer.getBean(JdbcTemplate.class);
    	 String sql="select count(*) from employee";
    	   Integer integer = bean.query(sql, new EmployeeResultSetExctractor());
    	   System.out.println(integer);
     	 
    	 AnnotationConfigApplicationContext.class.cast(containaer).close();	 
    }
}
