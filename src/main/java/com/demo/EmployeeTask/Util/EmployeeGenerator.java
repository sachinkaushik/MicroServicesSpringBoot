package com.demo.EmployeeTask.Util;

import java.util.ArrayList;
import java.util.List;

import com.demo.EmployeeTask.model.Employee;
import com.demo.EmployeeTask.model.Task;

public class EmployeeGenerator {
	enum TaskStatus {
		INPROGRESS, DONE, NOTSTARTED;
	}

	public static List<Employee> getEmployeeList() {

		List<Task> task1 = new ArrayList<>();
		task1.add(new Task(1, "module1", TaskStatus.DONE.toString()));
		task1.add(new Task(2, "module2", TaskStatus.NOTSTARTED.toString()));
		task1.add(new Task(3, "module3", TaskStatus.INPROGRESS.toString()));
		List<Task> task2 = new ArrayList<>();
		task2.add(new Task(1, "module1", TaskStatus.INPROGRESS.toString()));
		task2.add(new Task(2, "module2", TaskStatus.NOTSTARTED.toString()));
		task2.add(new Task(3, "module3", TaskStatus.DONE.toString()));
		List<Task> task3 = new ArrayList<>();
		task3.add(new Task(1, "module1", TaskStatus.INPROGRESS.toString()));
		task3.add(new Task(2, "module2", TaskStatus.NOTSTARTED.toString()));
		task3.add(new Task(3, "module3", TaskStatus.DONE.toString()));
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(1, "sachin", "developer", task1));
		empList.add(new Employee(2, "kaushik", "developer", task3));
		empList.add(new Employee(3, "john", "ui developer", task2));
		empList.add(new Employee(4, "smith", "spring", task1));
		empList.add(new Employee(5, "rohit", ".net", task2));
		empList.add(new Employee(6, "kohli", "php", task1));
		empList.add(new Employee(7, "pandya", "big data",task3));
		empList.add(new Employee(8, "sundar", "cricket", task3));
		empList.add(new Employee(9, "raman", "developer", task1));
		empList.add(new Employee(10, "sourabh", "developer", task2));
		
		return empList;
	}
}
