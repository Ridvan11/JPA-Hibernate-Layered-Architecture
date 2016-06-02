package _01.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="adiuser")
public class User {
	
	@Id
	@TableGenerator(name = "USER_GEN")
	@GeneratedValue(generator = "USER_GEN")
	private int userid;
	private String username;
	private String usersurname;
	private String useremail;
	private String userpassword;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsersurname() {
		return usersurname;
	}
	public void setUsersurname(String usersurname) {
		this.usersurname = usersurname;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String usersurname, String useremail,
			String userpassword) {
		super();
		this.username = username;
		this.usersurname = usersurname;
		this.useremail = useremail;
		this.userpassword = userpassword;
	}	

	
}
