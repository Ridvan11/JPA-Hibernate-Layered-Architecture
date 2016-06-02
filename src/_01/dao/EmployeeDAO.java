package _01.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import _01.domain.Employee;

public interface EmployeeDAO {

	public Employee createEmployee(String name, String surname, int salary);
	public Employee findEmployee(int id);
	public List<Employee> maxSalary();
	public List<Employee> asgariEmployees();
	public List<Employee> getEmployeeByN(int id);
	public List<Employee> findAllEmployees();
	public List<Employee> maxEmployees();
	public void removeEmployee(int id);
	
	public EntityManager getEntityManager();
	public EntityTransaction getTransaction();
}
