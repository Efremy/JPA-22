package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	//define fields for entityManager
	private EntityManager entityManager;
	
	//Set up constructor injection	
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager=theEntityManager;
	}
	
	@Override
	public List<Employee> findAll() {
		
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// create the query
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);
		
		//execute the query and get the result
		List<Employee> employee =theQuery.getResultList();
		
		//return the result
		return employee;
	}

	@Override
	public Employee findById(int theId) {
		
		// get the current hibernate session
		Session currentSession =entityManager.unwrap(Session.class);
		// get the employee
		Employee theEmployee =currentSession.get(Employee.class, theId);
		// return the employee
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(theEmployee);
		
	}

	@Override
	public void deleteById(int theId) {
		Session currentSession =entityManager.unwrap(Session.class);
		Query theQuery =currentSession.createQuery("delete from Employee where "
				+ "id=: employeeId");
		theQuery.setParameter("employeeId", theId);
		theQuery.executeUpdate();
		
	}

}
