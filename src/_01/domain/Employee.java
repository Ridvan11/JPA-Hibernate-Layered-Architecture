package _01.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="aditbl")
public class Employee {

	@Id
	@TableGenerator(name = "EMPLOYEE_GEN")
	@GeneratedValue(generator = "EMPLOYEE_GEN")
	private int id;
	private String name;
	private String surname;
	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	// constructors
	public Employee() {
		super();
	}

	public Employee(String name, String surname, int salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}

}
