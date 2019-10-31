package com.infosys.SpringJdbc2.util;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceUtil {

	 @Bean
	 public DataSource dataSource() {
		 
		  DriverManagerDataSource dataSource = new DriverManagerDataSource();
		  dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		  dataSource.setUsername("naresh");
		  dataSource.setPassword("naresh");
		  
		return dataSource;
		 
	 }
}
