package com.infosys.SpringJdbc2;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(MocUtil.class);
		JdbcTemplate template = container.getBean(JdbcTemplate.class);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Number");
		 int eno = scanner.nextInt();
		 
		  System.out.println("Enter A Name");
		     String name = scanner.next();
		     
		     System.out.println("Enter A Salary");
		       double salary = scanner.nextDouble();

	      int update = template.update("insert into  employee values(?,?,?)", 
	    		  new PreparedStatementSetter() {
					
					@Override
					public void setValues(PreparedStatement ps) throws SQLException {
						ps.setInt(1, eno);
						ps.setString(2, name);
						ps.setDouble(3, salary);
					}
				}
	       );
	       System.out.println(update);

		AnnotationConfigApplicationContext.class.cast(container).close();
	}
}
