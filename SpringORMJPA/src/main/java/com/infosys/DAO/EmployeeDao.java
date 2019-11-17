package com.infosys.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infosys.entity.Employee;

@Repository
public class EmployeeDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void save(Employee employee) {

		entityManager.persist(employee);

	}
}
