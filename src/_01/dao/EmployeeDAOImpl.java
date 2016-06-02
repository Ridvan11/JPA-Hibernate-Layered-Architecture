package _01.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import _01.domain.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;

	public EmployeeDAOImpl() {

		entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
		// create EntityManagerFactory
		//
		entityManager = entityManagerFactory.createEntityManager();
		// create EntityManager
		entityTransaction = entityManager.getTransaction();
		// get EntityTransaction
	}

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public EntityTransaction getTransaction() {
		return entityTransaction;
	}

	@Override
	public Employee createEmployee(String name, String surname, int salary) {

		Employee employee = new Employee(name, surname, salary);

		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();

		return employee;
	}

	@Override
	public Employee findEmployee(int id) {
		return entityManager.find(Employee.class, id);
	}

	@Override
	public List<Employee> findAllEmployees() {
		TypedQuery<Employee> query = entityManager.createQuery("Select e from Employee e", Employee.class);
		return query.getResultList();

	}
	
	@Override
	public List<Employee> maxEmployees() {
		TypedQuery<Employee> queryi = entityManager.createQuery("Select e " + "from Employee e " + "where e.name LIKE 'o%'", Employee.class);
		return queryi.getResultList();
	}
	
		@Override
		public List<Employee> maxSalary() {
			// :empId --> Named Parameter
			TypedQuery<Employee> querymax = entityManager.createQuery("SELECT e FROM Employee e ORDER BY e.salary DESC",Employee.class);

			return querymax.setMaxResults(3).getResultList();			
		} 
	
		@Override
		public List<Employee> asgariEmployees() {
			TypedQuery<Employee> queryasg = entityManager.createQuery("SELECT e FROM Employee e WHERE e.salary >= 1000 AND e.salary <= 1300", Employee.class);
			return queryasg.getResultList();
		}
		
		// Query parameters
		// Named Parameter
		@Override
		public List<Employee> getEmployeeByN(int id) {
			// :empId --> Named Parameter
			TypedQuery<Employee> query = entityManager.createQuery("SELECT e FROM Employee e WHERE e.id= :empId",
					Employee.class).setParameter("empId", id);

			return query.getResultList();
			// X getSingleResult();
		}
	

	@Override
	public void removeEmployee(int id) {

		Employee emp = findEmployee(id);

		if (emp != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(emp);
			entityManager.getTransaction().commit();
		}

	}

}
