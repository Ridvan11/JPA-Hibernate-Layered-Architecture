package _01.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import _01.domain.Product;

@ManagedBean
@SessionScoped
public class ProdCatgController {

	private String pname;
	private String pprice;
	private int stok;
	private int pid;
	
	
	
	// Getter setterlardan sonra alt kisim onemli

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

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	private List<Product> proList = new ArrayList<Product>();
	
	public List<Product> getProList() {
		return proList;
	}

	public void setProList(List<Product> proList) {
		this.proList = proList;
	}

//	public void addPro(){
//		EmployeeService empService = new EmployeeServiceImpl();
//		empService.createEmployee(name, surname, salary);
//		
//		employeeList = empService.findAllEmployees();
//		
//	}
//	
//	public void listelePro(){
//		EmployeeService empService = new EmployeeServiceImpl();		
//		employeeList = empService.findAllEmployees();
//		
//	}
	
	
}
