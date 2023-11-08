package com.jsp.springbootcrud.repository;

	import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.springbootcrud.dto.Employee;

	public interface EmployeeRePository extends JpaRepository<Employee,Integer>{
		@Query("select a from Employee a where name=:name and phone=:phone")
		public Employee login(@RequestParam String name,@RequestParam long phone);
		
	}


