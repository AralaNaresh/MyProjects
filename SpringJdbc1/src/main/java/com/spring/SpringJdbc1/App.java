package com.spring.SpringJdbc1;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class App {

	public static void main( String[] args )
    {
      
    	 ApplicationContext containaer = new  AnnotationConfigApplicationContext(MocUtil.class);
    	   
    	  JdbcTemplate jdbctemplate = containaer.getBean(JdbcTemplate.class);
    	 String sql="select * from employee";
    	   ArrayList<Employee> list = jdbctemplate.query(sql,  
    			  new ResultSetExtractor<ArrayList<Employee>>() {

					@Override
					public ArrayList<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
						ArrayList<Employee> arrayList = new ArrayList<Employee>();
						 while(rs.next()) {
							 Employee employee = new Employee();
							 employee.setId(rs.getInt(1));
							 employee.setName(rs.getString(2));
							 employee.setSalary(rs.getDouble(3));
							 arrayList.add(employee);
						 }
						return arrayList;
					}
    	      });
    	   
    	   
    	    for (Employee employee : list) {
				System.out.println(employee);
			}
    	 AnnotationConfigApplicationContext.class.cast(containaer).close();	 
    }
}

