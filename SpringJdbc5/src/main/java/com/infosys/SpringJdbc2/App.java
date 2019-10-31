package com.infosys.SpringJdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

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

	     int update = template.update(new  PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				
				    PreparedStatement prepareStatement = con.prepareStatement("insert into employee values(?,?,?)");
				     prepareStatement.setInt(1	,eno);
				     prepareStatement.setString(2, "name");
				     prepareStatement.setDouble(3, salary);
				
				return prepareStatement;
		   	}
	  	  } 
	    		 
	     );
	       System.out.println(update);

		AnnotationConfigApplicationContext.class.cast(container).close();
	}
}
