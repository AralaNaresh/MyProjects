package com.infosys.Util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Component;

@Configuration
public class JpaTransactionManagerUtil {
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Bean
	public JpaTransactionManager jpaTransactionManager() {

		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}

}
