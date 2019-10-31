package com.infosys.SpringJdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(MocUtil.class);
		JdbcTemplate template = container.getBean(JdbcTemplate.class);

//	Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter A Number");
//		int eno = scanner.nextInt();
//
//		System.out.println("Enter A Name");
//		String name = scanner.next();
//
//		System.out.println("Enter A Salary");
//		double salary = scanner.nextDouble();

	 final double salary=5000;
	 String sql="select * from employee where salary>?";
		 ArrayList<Employee> emplist = template.query(
				new PreparedStatementCreator() {
					
					@Override
					public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
						PreparedStatement prepareStatement = con.prepareStatement(sql);
						prepareStatement.setDouble(1, salary);
						return prepareStatement;
					}
				}, 
				
				new ResultSetExtractor<ArrayList<Employee>>() {

					@Override
					public ArrayList<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
						ArrayList<Employee> emplist = new ArrayList<Employee>();
						while(rs.next()) {
							Employee employee = new Employee();
							employee.setId(rs.getInt("id"));
							employee.setName(rs.getString("name"));
							employee.setSalary(rs.getDouble("salary"));
							emplist.add(employee);
						}
						return emplist;
					}
				}
		);
	for (Employee employee : emplist) {
		System.out.println(employee);
	}
		AnnotationConfigApplicationContext.class.cast(container).close();
	}
}
