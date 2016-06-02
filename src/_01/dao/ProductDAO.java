package _01.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import _01.domain.Product;

public interface ProductDAO {
	
	public Product createProduct(String pname, String pprice, int stok, int catid);
	public Product findProduct(int pid);
	public List<Product> findAllProduct();
	
	public void removeProduct(int pid);
	
	public EntityManager getEntityManager();
	public EntityTransaction getTransaction();

}
