package com.infosys.util;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "com/infosys/config/db.properties")
public class DataSourceUtil {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public DataSource datasource() {
	
		 BasicDataSource dataSource = new BasicDataSource();
		 dataSource.setUrl(environment.getProperty("db.url"));
		 dataSource.setUsername(environment.getProperty("db.username"));
		 dataSource.setPassword(environment.getProperty("db.password"));
		 
		return dataSource;
	}
	 

}
