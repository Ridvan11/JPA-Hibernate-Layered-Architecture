package _01.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import _01.dao.ProductDAO;
import _01.dao.ProductDAOImpl;
import _01.domain.Product;

@ManagedBean
@SessionScoped
public class ProductController {
	
	private int pid;
	private String pname;
	private String pprice;
	private int stok;
	private int cid;
	
		
	// Getter setterlardan sonra alt kisim onemli

	public int getPid() {
		return pid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPprice() {
		return pprice;
	}

	public void setPprice(String pprice) {
		this.pprice = pprice;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}

	private List<Product> productList = new ArrayList<Product>();
			
	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public void addProduct(){
		ProductDAO proService = new ProductDAOImpl();
		proService.createProduct(pname, pprice, stok, cid);
		//public Product createProduct(String pname, String pprice, int stok, int catid);
		
		productList = proService.findAllProduct();		
	}
	
	public void listeleProduct(){
		ProductDAO proService = new ProductDAOImpl();		
		productList = proService.findAllProduct();
		
	}
//	public void deleteEmployee(int id){
//		EmployeeService empService = new EmployeeServiceImpl();
//		empService.removeEmployee(id);
//		
//		employeeList = empService.findAllEmployees();
//	}

}
