package com.infosys.entity;

import javax.persistence.Entity;
import javax.persistence.IdClass;

@Entity
public class Employee {

	@javax.persistence.Id
	private Integer ID;
	private String NAME;
	private Double SALARY;

	public Employee() {
	}

	public Employee(Integer iD, String nAME, Double sALARY) {
		super();
		ID = iD;
		NAME = nAME;
		SALARY = sALARY;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public Double getSALARY() {
		return SALARY;
	}

	public void setSALARY(Double sALARY) {
		SALARY = sALARY;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", NAME=" + NAME + ", SALARY=" + SALARY + "]";
	}

}
