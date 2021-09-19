package com.example.demo;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@SpringBootTest
class SampleApplicationTests {
	
	@Autowired
	EmployeeService employeeService;
	

	@Test
	void contextLoads() {
	}
	
	@Test
	public void getEmployee() {
		
		Employee expected = employeeService.getEmployee(50000);
		
		Employee actual = new Employee();
		actual.setName("Chinna");
		actual.setDesignation("DEVELOPER");
		actual.setSalary(50000.0);
		int pf = (50000/100)*3;
		actual.setPF(pf);
		double netsalary = 50000.0-pf;
		actual.setMonthly(netsalary);
		
	//	Employee expected2 = get.actual;
		
		assertEquals(actual.getName(),expected.getName());
		//assertEquals(actual.getPF(),expected.getPF());
	}
	

}
