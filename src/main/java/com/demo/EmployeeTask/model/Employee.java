package com.demo.EmployeeTask.model;

import java.util.List;

public class Employee {

	private Integer id;
	private String name;
	private String job;
	private List<Task> tasks;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer id, String name, String job, List<Task> tasks) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.tasks = tasks;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	
}
