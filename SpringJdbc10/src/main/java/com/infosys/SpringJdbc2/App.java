package com.infosys.SpringJdbc2;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(MocUtil.class);
		JdbcTemplate template = container.getBean(JdbcTemplate.class);

		String sql = "select name from employee where id=4";

		 String names = template.queryForObject(sql, String.class);
		 System.out.println(names);
		 
		AnnotationConfigApplicationContext.class.cast(container).close();
	}
}
