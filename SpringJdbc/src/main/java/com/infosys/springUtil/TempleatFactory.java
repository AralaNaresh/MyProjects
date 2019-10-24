package com.infosys.springUtil;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class TempleatFactory {
	@Autowired
	private DataSource dataSource;
	
  @Bean
public JdbcTemplate jdbcTemplate() {
	JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	//jdbcTemplate.update("insert into employee values(?,?,?)" ,1,"naresh",25252d);
	return jdbcTemplate;
}
  }
