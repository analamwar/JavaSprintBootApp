package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Employee;

@Service
public class EmployeeService {
	
	
	public List<Employee> getExperiencedEmployee(int experience)
	{
		
		Employee e1 = new Employee(1, "abc", 2);
		Employee e2 = new Employee(1, "df", 3);
		Employee e3 = new Employee(1, "zw", 4);
		Employee e4 = new Employee(1, "zdv", 5);
		Employee e5 = new Employee(1, "zdd", 6);
		
		List<Employee> employeList = new ArrayList<>();
		employeList.add(e1);
		employeList.add(e2);
		employeList.add(e3);
		employeList.add(e4);
		employeList.add(e5);
		
		return employeList.stream().filter(a -> a.getEmployeExperience() > experience).toList();
		
	}

}
