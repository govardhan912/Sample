package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;




@Service
public class EmployeeService {
	
	
	public Employee getEmployee(int salary) {
		
		Employee emp = new Employee();
	//	Employee emp1 = new Employee();//null
		
	//	System.out.println("Salary = "+salary);
	//	System.out.println("3/100 = "+(3/100));
		int pf =(int) (salary/100)*3;
		double netSalary = salary-pf;
		emp.setName("Chinna");
		emp.setDesignation("DEVELOPER");
		emp.setSalary(salary);
		emp.setPF(pf);
		emp.setMonthly(netSalary);
		
		return emp;
	}

}
