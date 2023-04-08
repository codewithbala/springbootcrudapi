package in.bala.springbootcrud.sprinbootcrudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bala.springbootcrud.sprinbootcrudapi.model.Employee;
import in.bala.springbootcrud.sprinbootcrudapi.service.EmployeeService;

//make this class as RestController using annotation
@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService; 
   //create method that returns a list of employees and annotate with Request Mapping
	@GetMapping("/employee")
	public List<Employee> get(){
		return employeeService.get();
	}
}
