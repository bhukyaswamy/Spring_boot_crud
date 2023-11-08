package com.jsp.springbootcrud.service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.jsp.springbootcrud.dao.EmployeeDao;
	import com.jsp.springbootcrud.dto.Employee;

	@Service
	public class EmployeeService {
		@Autowired
		EmployeeDao dao;
		public Employee saveEmployee(Employee employee) {
			return dao.saveEmployee(employee);
		}
		
		public List<Employee> getAllEmployee(){
			return dao.getAllEmployee();
		}
		public Employee getEmployeeById(int id) {
			return dao.getEmployeeById(id);
		}
		public Employee updateEmployee(Employee employee) {
			return dao.updateEmployee(employee);
		}
		public Employee deleteEmployee(int id) {
			return dao.deleteEmployee(id);
		}
		public Employee login(String name, long phone) {
			return dao.login(name, phone);
		}
		
	}



