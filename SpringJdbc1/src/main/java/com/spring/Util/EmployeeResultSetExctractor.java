package com.spring.Util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeResultSetExctractor implements ResultSetExtractor<Integer> {

	@Override
	public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
		
	 int count =1;
		if(rs.next()) {
		count= rs.getInt(1);
			
		}
		return count;
				
		
		
	}

	
	}


