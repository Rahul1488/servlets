package com.te.servletsexample2;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	private String ename;
	private String edes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdes() {
		return edes;
	}
	public void setEdes(String edes) {
		this.edes = edes;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", ename=" + ename + ", edes=" + edes + "]";
	}
	

}
