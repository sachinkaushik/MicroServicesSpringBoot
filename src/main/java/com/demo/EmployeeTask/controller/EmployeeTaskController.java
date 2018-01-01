package com.demo.EmployeeTask.controller;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.EmployeeTask.Util.EmployeeGenerator;
import com.demo.EmployeeTask.model.Employee;
import com.demo.EmployeeTask.model.Task;

@RestController
public class EmployeeTaskController {

	@RequestMapping(value="employees", method= RequestMethod.GET)
	public ResponseEntity<?> getAllEmployee(){
		return new ResponseEntity<>(EmployeeGenerator.getEmployeeList(), HttpStatus.OK);
	}
	
	
	@RequestMapping(value="employee/{id}", method= RequestMethod.GET)
	public ResponseEntity<?> getEmployeeById(@PathVariable Integer id){
		Employee emp = EmployeeGenerator.getEmployeeList().stream().filter(obj -> id.equals(obj.getId())).findAny().orElse(null);
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
	
	@RequestMapping(value="employee/{id}/task/{taskId}", method= RequestMethod.GET)
	public ResponseEntity<?> getEmployeeTask(@PathVariable Integer id, @PathVariable Integer taskId){
		Employee emp = EmployeeGenerator.getEmployeeList().stream().filter(obj -> id.equals(obj.getId())).findAny().orElse(null);
		Task task = emp.getTasks().stream().filter(obj -> taskId.equals(obj.getId())).findFirst().orElse(null);
		emp.setTasks(Arrays.asList(task));
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
}
