package com.bp.demo01.bean;

public class Employee {
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private Integer id;
	private String name;
	private int age;
	private String team;
	private Department department;
	
	public Employee(Integer id, String name, int age, String team, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.team = team;
		this.department = department;
	}
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", team=" + team + ", department="
				+ department + "]";
	}

}
