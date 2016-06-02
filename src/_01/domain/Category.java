package _01.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="adicategory")
public class Category {

	@Id
	@TableGenerator(name="CATEGORY_GEN")
	@GeneratedValue(generator="CATEGORY_GEN")
	private int cid;
	private String cName;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(String cName) {
		super();
		this.cName = cName;
	}
	

}
