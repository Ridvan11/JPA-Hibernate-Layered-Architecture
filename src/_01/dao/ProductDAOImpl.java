package _01.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import _01.domain.Product;

public class ProductDAOImpl implements ProductDAO {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;

	public ProductDAOImpl() {

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
	public Product createProduct(String pname, String pprice, int stok, int catid) {

		Product product = new Product(pname, pprice, stok, catid);

		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();

		return product;
	}

	@Override
	public Product findProduct(int id) {
		return entityManager.find(Product.class, id);
	}

	@Override
	public List<Product> findAllProduct() {
		TypedQuery<Product> query = entityManager.createQuery("Select e from Product e", Product.class);
		return query.getResultList();

	}
	
	@Override
	public void removeProduct(int id) {

//		Product pro = findProduct(id);
//
//		if (pro != null) {
//			entityManager.getTransaction().begin();
//			entityManager.remove(pro);
//			entityManager.getTransaction().commit();
//		}

	}

}
