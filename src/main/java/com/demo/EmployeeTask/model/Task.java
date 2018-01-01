package com.demo.EmployeeTask.model;

public class Task {

	private Integer id;
	private String name;
	private String status;
	
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(Integer id, String name, String status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
	public Integer getId() {
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
