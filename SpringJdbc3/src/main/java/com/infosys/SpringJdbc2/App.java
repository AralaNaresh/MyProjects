package com.infosys.SpringJdbc2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(MocUtil.class);
		JdbcTemplate template = container.getBean(JdbcTemplate.class);

		String sql = "select count ( *) from employee";

		List<Integer> list = template.query(sql, new RowMapper<Integer>() {

			int count = 1;

			@Override
			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {

				return count = rs.getInt(1);

			}
		});

		for (Integer integer : list) {
			System.out.println(integer);
		}

		AnnotationConfigApplicationContext.class.cast(container).close();
	}
}
