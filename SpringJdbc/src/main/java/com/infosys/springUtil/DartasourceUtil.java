package com.infosys.springUtil;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DartasourceUtil {
	  
	@Bean
	 public DataSource dataSource() {
		 
		  DriverManagerDataSource dataSource = new DriverManagerDataSource();
		   dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		   dataSource.setUsername("naresh");
		   dataSource.setPassword("naresh");
		   
				 
		 return dataSource ;
		 
		 	 }

}
