package _01.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name="adiproduct")
public class Product {

	@Id
	@TableGenerator(name="PRODUCT_GEN")
	@GeneratedValue(generator="PRODUCT_GEN")
	private int pid;
	private String pname;
	private String pprice;
	private int pstok;
	
	@ManyToOne
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	private Category category;
	
//	@ManyToOne
//	@JoinColumn(name="pro_catg_id")
//	// tek bir @ManyToOne varsa bu durumda iliski unidirectional ManyToOne
	private int cid;
	
		

	public int getPid() {
		return pid;
	}

	public String getPprice() {
		return pprice;
	}

	public void setPprice(String pprice) {
		this.pprice = pprice;
	}

	public int getPstok() {
		return pstok;
	}

	public void setPstok(int pstok) {
		this.pstok = pstok;
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
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String pname, String pprice, int pstok, int cid) {
		super();
		this.pname = pname;
		this.pprice = pprice;
		this.pstok = pstok;
		this.cid = cid;
	}

}