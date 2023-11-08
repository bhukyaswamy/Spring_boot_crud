package com.jsp.springbootcrud.dao;

	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.springbootcrud.dto.Employee;
	import com.jsp.springbootcrud.repository.EmployeeRePository;

	@Repository
	public class EmployeeDao {
		@Autowired
		EmployeeRePository employeeRePository;
		public Employee saveEmployee(Employee employee) {
			return employeeRePository.save(employee);
		}
		
		public List<Employee> getAllEmployee(){
			return employeeRePository.findAll();
		}
		public Employee getEmployeeById(int id) {
			Optional<Employee> optional=employeeRePository.findById(id);
			if(optional.isPresent()) {
				return optional.get();
			}else{
				return null;
			}
		}
		public Employee updateEmployee(Employee employee) {
			Optional<Employee> optional=employeeRePository.findById(employee.getId());
			if(optional.isPresent()) {
				return employeeRePository.save(employee);
			}
			return null;
		}
		public Employee deleteEmployee(int id) {
			Optional<Employee> optional=employeeRePository.findById(id);
			if(optional.isPresent()) {
				employeeRePository.delete(optional.get());
			}
			return optional.get();
		}
		@RequestMapping
		public Employee login(String name, long phone) {
			return employeeRePository.login(name, phone);
		}
		
		
	}
	
