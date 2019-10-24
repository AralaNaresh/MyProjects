package com.spring.Util;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourcesUtil {
	@Bean
	public DataSource dataSources() {

		DriverManagerDataSource dataSource  = new DriverManagerDataSource();

		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("naresh");
		dataSource.setPassword("naresh");

		return dataSource;

	}

}
