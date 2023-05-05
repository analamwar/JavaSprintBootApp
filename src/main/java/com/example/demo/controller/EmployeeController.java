package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/getemployee")
	public List<Employee> getEmployeeDetails(@RequestParam("experience") int experience)
	{
		//get all the details from service
		return employeeService.getExperiencedEmployee(experience);
		
	}
}
