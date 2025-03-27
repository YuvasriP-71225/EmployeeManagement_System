package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	private EmployeeService service;
	public EmployeeController(EmployeeService service)
	{
		this.service=service;
	}
	
	@GetMapping
	public String showAllEmployees(Model model)
	{
		model.addAttribute("employees", service.getAllEmployees());
		return "list";
	}
	@GetMapping("/add")
	public String addEmployeeForm(Model model)
	{
		model.addAttribute("employee", new Employee());
		return "add";
	}
	@PostMapping("/add")
	public String saveEmployee(@ModelAttribute Employee employee)
	{
		service.saveEmployee(employee);
		return "redirect:/employees";
	}
	@GetMapping("/edit/{id}")
	public String editEmployeeForm(@PathVariable Long id, Model model)
	{
		Employee employee = service.getEmployeeById(id); // Fetch the employee by ID
	    model.addAttribute("employee", employee); // Add to the model
	    return "edit";
	}
	@PostMapping("edit/{id}")
	public String updateEmployeeForm(@PathVariable Long id, @ModelAttribute Employee employee)
	{
		
		employee.setId(id);
		service.saveEmployee(employee);
	    return "redirect:/employees";
	}
	@GetMapping("delete/{id}")
	public String deleteEmployeeForm(@PathVariable Long id)
	{
		service.deleteEmployee(id);
		return "redirect:/employees";
	}
	@GetMapping("/search")
	public String searchEmployees(@RequestParam("keyword") String keyword, Model model) {
	    model.addAttribute("employees", service.searchEmployees(keyword));
	    return "list";
	}
	@GetMapping("/{id}")
	public String viewEmployeeDetails(@PathVariable Long id, Model model) {
	    model.addAttribute("employee", service.getEmployeeById(id));
	    return "details";
	}

	

	}



