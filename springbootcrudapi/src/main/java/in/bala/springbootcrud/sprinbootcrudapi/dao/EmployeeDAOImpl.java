package in.bala.springbootcrud.sprinbootcrudapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.bala.springbootcrud.sprinbootcrudapi.model.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<Employee> get() {
		//create a curresntSession object and unwrapping Session class from Hibernate
		Session currentSession = entityManager.unwrap(Session.class);
		//Employee is the model class name and second argument is the employee class
		// assigning RHS to Query which is of Type Employee
		Query<Employee> query =  currentSession.createQuery("from Employee", Employee.class);
		//query.getResultList() will give us the list of employees
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
