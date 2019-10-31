package com.infosys.SpringJdbc2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(MocUtil.class);
		JdbcTemplate template = container.getBean(JdbcTemplate.class);

		String sql = "select count ( *) from employee";

	Integer query = template.query(sql, 
				 new ResultSetExtractor<Integer>() {

					@Override
					public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
						int count=1;
						while(rs.next()) {
							count = rs.getInt(1);
						}
						return count;
					}
				}
		 );

		System.out.println(query);

		AnnotationConfigApplicationContext.class.cast(container).close();
	}
}
