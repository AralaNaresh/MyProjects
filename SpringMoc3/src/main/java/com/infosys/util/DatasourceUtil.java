package com.infosys.util;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource(value = "com/infosys/config/db.properties")
public class DatasourceUtil {
	@Autowired
	private Environment environment;
	
	@Bean
	public DataSource dataSource() {
		 DriverManagerDataSource dataSource = new DriverManagerDataSource();
		 
		dataSource.setUrl(environment.getProperty("db.url"));
		dataSource.setUsername(environment.getProperty("db.username"));
		dataSource.setPassword(environment.getProperty("db.password"));
		
				
		return dataSource;
		
	}

}
