package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/request")
public class HomeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestParam int salary) {
		
		//Employee employee = new Employee(); // null
		
		return employeeService.getEmployee(salary);
		
	
	}
/*	
	@GetMapping("/get")
	public EmployeeSalary getEmployeeSalary(@RequestParam EmployeeSalary employeeSalary) {
		return employeeService.getEmployeeSalary(employeeSalary);
	}
*/
}
