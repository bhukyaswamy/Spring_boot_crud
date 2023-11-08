package com.jsp.springbootcrud.controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedMetric;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

	import com.jsp.springbootcrud.dto.Employee;
	import com.jsp.springbootcrud.service.EmployeeService;

	@RestController
	public class EmployeeController {
		@Autowired
		EmployeeService employeeService;
		
		@PostMapping("/saveEmployees") //post
		public Employee saveEmployee(@RequestBody Employee employee) {
			return employeeService.saveEmployee(employee);
			
		}
		@GetMapping("/GetAllemployee") //post
		public List<Employee> getAllEmployee(){
			return employeeService.getAllEmployee();
		}
		@GetMapping("/employee/{id}") //get
		public Employee getEmployeeById(@PathVariable int id) {
			return employeeService.getEmployeeById(id);
		}
		@PutMapping("/updateEmployee") //put
		public Employee updateEmployee(@RequestBody Employee employee) {
			return employeeService.updateEmployee(employee);
		}
		@DeleteMapping("/deleteEmployee") //delete
		public Employee deleteEmployee(@RequestParam int id) {
			return employeeService.deleteEmployee(id);
		}
		public Employee login(@RequestParam String name,@RequestParam long phone) {
			return employeeService.login(name, phone);
		}
	
		
	}

