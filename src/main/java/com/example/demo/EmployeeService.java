package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	
	
		private EmployeeInterface repository;
		public EmployeeService(EmployeeInterface repository)
		{
			this.repository=repository;
		}

		

		public List<Employee> getAllEmployees()
		{
			return repository.findAll();
		}
		public Employee getEmployeeById(Long id)
		{
			return repository.findById(id).orElse(null);
		}
		public Employee saveEmployee(Employee employee)
		{
			return repository.save(employee);
		}
		public void deleteEmployee(Long id)
		{
			repository.deleteById(id);
		}
		public List<Employee> searchEmployees(String keyword) {
		    return repository.findByNameContainingIgnoreCaseOrDepartmentContainingIgnoreCase(keyword, keyword);
		}
		
		


}
