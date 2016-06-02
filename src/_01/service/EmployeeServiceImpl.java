package _01.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import _01.dao.EmployeeDAOImpl;
import _01.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();

	@Override
	public Employee createEmployee(String name, String surname, int salary) {

		return employeeDAOImpl.createEmployee(name, surname, salary);
	}

	@Override
	public Employee findEmployee(int id) {

		return employeeDAOImpl.findEmployee(id);
	}

	@Override
	public EntityManager getEntityManager() {

		return employeeDAOImpl.getEntityManager();
	}

	@Override
	public EntityTransaction getTransaction() {
		// TODO Auto-generated method stub
		return employeeDAOImpl.getTransaction();
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeDAOImpl.findAllEmployees();
	}
	
	@Override
	public List<Employee> maxEmployees() {
		return employeeDAOImpl.maxEmployees();
	}

	@Override
	public void removeEmployee(int id) {
		
		employeeDAOImpl.removeEmployee(id);
		
	}

}
