package com.infosys.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.infosys.entity.Employee;

@Repository
public class EmployeeDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public Integer Save(Employee employee) {

		 return Integer.class.cast(hibernateTemplate.save(employee));
		
	

	}

}
