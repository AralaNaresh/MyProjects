package com.infosys.SpringJdbc2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(MocUtil.class);
		JdbcTemplate template = container.getBean(JdbcTemplate.class);

		String sql = "select name from employee where id=6";

		List<Map<String, Object>> queryForList = template.queryForList(sql);

		for (Map<String, Object> map : queryForList) {
			System.out.println(map);
		}

		AnnotationConfigApplicationContext.class.cast(container).close();
	}
}
