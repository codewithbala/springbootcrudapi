package in.bala.springbootcrud.sprinbootcrudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.bala.springbootcrud.sprinbootcrudapi.dao.EmployeeDAO;
import in.bala.springbootcrud.sprinbootcrudapi.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	//create employeeDAO object
	private EmployeeDAO employeeDAO;
	
    @Transactional
	@Override
	public List<Employee> get() {
		return employeeDAO.get();
	}
    @Transactional
	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
    @Transactional
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		
	}
    @Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
