package in.bala.springbootcrud.sprinbootcrudapi.service;

import java.util.List;

import in.bala.springbootcrud.sprinbootcrudapi.model.Employee;

public interface EmployeeService {
	List<Employee> get();
	// Below code will return a single employee record
	Employee get(int id);
	//save() will take an argument which is the Employee object
	void save(Employee employee);
	// to delete a record we need the id as argument
	void delete(int id);
}
