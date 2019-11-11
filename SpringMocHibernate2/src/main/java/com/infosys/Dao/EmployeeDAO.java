package com.infosys.Dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.infosys.entity.Employee;

@Repository
public class EmployeeDAO extends HibernateDaoSupport {
	
	@Autowired
	public EmployeeDAO(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}

	public Integer Save(Employee employee) {

		 return Integer.class.cast(getHibernateTemplate().save(employee));
		
	

	}

}
