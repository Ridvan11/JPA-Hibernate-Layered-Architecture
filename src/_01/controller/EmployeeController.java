package _01.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import _01.dao.EmployeeDAO;
import _01.dao.EmployeeDAOImpl;
import _01.domain.Employee;
import _01.service.EmployeeService;
import _01.service.EmployeeServiceImpl;

@ManagedBean
@SessionScoped
public class EmployeeController {

	private String name;
	private String surname;
	private int salary;
	private int empid;
	
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// Getter setterlardan sonra alt kisim onemli

	private List<Employee> employeeList = new ArrayList<Employee>();
	
	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	public void addEmployee(){
		EmployeeService empService = new EmployeeServiceImpl();
		empService.createEmployee(name, surname, salary);
		
		employeeList = empService.findAllEmployees();
		
	}
	
	public void listeleEmployee(){
		EmployeeService empService = new EmployeeServiceImpl();		
		employeeList = empService.findAllEmployees();
		
	}
	
	public void maxiEmployee(){
		EmployeeService empService = new EmployeeServiceImpl();		
		employeeList = empService.maxEmployees();		
	}
	
	
	public void deleteEmployee(int id){
		EmployeeService empService = new EmployeeServiceImpl();
		empService.removeEmployee(id);
		
		employeeList = empService.findAllEmployees();
	}
	
	public void enYuksekSalary(){
		EmployeeDAO empdao = new EmployeeDAOImpl();		
		employeeList = empdao.maxSalary();
	}
	public void asgariEmp(){
		EmployeeDAO empdao = new EmployeeDAOImpl();		
		employeeList = empdao.asgariEmployees();
	}
	
	public void aEmp(){
		EmployeeDAO empdao = new EmployeeDAOImpl();		
		employeeList = empdao.getEmployeeByN(empid);
	}
}
