package com.infosys.Util;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.stereotype.Component;

@Configuration
public class LocalContainerEntityManagerFactoryBeanUtil {
	
	@Autowired
	private DataSource dataSource;

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {

		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryBean.setDataSource(dataSource);
		entityManagerFactoryBean.setPackagesToScan("com.infosys.entity");
		entityManagerFactoryBean.setJpaVendorAdapter(new EclipseLinkJpaVendorAdapter());
		entityManagerFactoryBean.setJpaProperties(Properties());
		
		return entityManagerFactoryBean;

	}

	private Properties Properties() {
		java.util.Properties properties = new Properties();
		properties.setProperty("eclipselink.weaving","false");
		return properties;
	}

}
