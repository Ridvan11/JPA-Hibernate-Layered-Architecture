package _01.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityTransaction;

import _01.domain.User;
import _01.service.UserService;
import _01.service.UserServiceImpl;

@ManagedBean
@SessionScoped
public class UserController {
	
	private String username;
	private String usersurname;
	private String useremail;
	private String userpassword;
	private String message;
	 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
     
    public void saveMessage() {
        FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + message) );
        context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
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
	
	private List<User> userList = new ArrayList<User>();
	
	private String adminname;

	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	public void addUser(){
		UserService usrService = new UserServiceImpl();
		usrService.createUser(username, usersurname, useremail, userpassword);
		saveMessage();
		userList = usrService.findAllUsers();
				
	}
	
	public void listeleUser() {
		UserService usrService = new UserServiceImpl();
		userList = usrService.findAllUsers();
	}
	
	public void asd() {
		FacesContext context = FacesContext.getCurrentInstance();
        
        context.addMessage(null, new FacesMessage("Successful",  "Kayýt Baþarýlý") );
        context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
		
	}
	
	
	public void deleteUser(int userid) {
		UserService usrService = new UserServiceImpl();
		usrService.removeUser(userid);
		userList = usrService.findAllUsers();
	
	}
	

	
	
}
