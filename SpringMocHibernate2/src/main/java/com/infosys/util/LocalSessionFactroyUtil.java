package com.infosys.util;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.infosys.entity.Employee;

@Configuration
public class LocalSessionFactroyUtil {

	@Autowired
	private DataSource dataSource;

	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean() {

		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setAnnotatedClasses(Employee.class);
	//	sessionFactory.setAnnotatedPackages("com.infosys.entity.Employee.class");
		sessionFactory.setHibernateProperties(properties());

		return sessionFactory;

	}
	
	private Properties properties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.show-sql", "true");
		return properties;
	}

}
