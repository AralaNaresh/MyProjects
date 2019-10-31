package com.infosys.SpringJdbc2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
     ApplicationContext container = new AnnotationConfigApplicationContext(MocUtil.class);
         JdbcTemplate template = container.getBean(JdbcTemplate.class);
         
         String sql="select * from employee";
         List<Employee> list = template.query(sql, 
        		 
        		 new RowMapper<Employee>() {
                   public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
						
						Employee employee = new Employee();
						
						employee.setId(rs.getInt(1));
						employee.setName(rs.getString(2));
						employee.setSalary(rs.getDouble(3));
						
						return employee;
					}				
				
				}
         );
         
          for (Employee employee : list) {
			System.out.println(employee);
		}
        
        
     AnnotationConfigApplicationContext.class.cast(container).close();
    }
}
