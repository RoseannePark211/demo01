package com.bp.demo01.bean;


import java.util.List;

public class Department {
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private String name;
	List<Employee> employees;

	
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department{" +
				"id=" + id +
				", name='" + name + '\'' +
				", employees=" + employees +
				'}';
	}
}
