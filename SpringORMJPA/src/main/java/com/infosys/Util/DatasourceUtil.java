package com.infosys.Util;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource(value = "com/infosys/config/db.properties")
public class DatasourceUtil {
 
	@Autowired
	private Environment environment;
	
	@Bean
	public DataSource dataSource() {
		
		 BasicDataSource dataSource = new BasicDataSource();
		 dataSource.setUrl(environment.getProperty("db.url"));
		 dataSource.setUsername(environment.getProperty("db.username"));
		 dataSource.setPassword(environment.getProperty("db.password"));
		return dataSource;
	}
}
