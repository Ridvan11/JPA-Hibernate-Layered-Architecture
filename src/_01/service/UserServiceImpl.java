package _01.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import _01.dao.UserDAOImpl;
import _01.domain.User;

public class UserServiceImpl implements UserService{
	
	UserDAOImpl userDAOImpl = new UserDAOImpl();

	@Override
	public User createUser(String username, String usersurname,
			String useremail, String userpassword) {
		
		return userDAOImpl.createUser(username, usersurname, useremail, userpassword);
	}

	@Override
	public User findUser(int userid) {		
		return userDAOImpl.findUser(userid);
	}

	@Override
	public List<User> findAllUsers() {		
		return userDAOImpl.findAllUsers();
	}

	@Override
	public String adminname() {		
		return userDAOImpl.adminname();
	}
	
	@Override
	public void removeUser(int userid) {
		userDAOImpl.removeUser(userid);
	}

	@Override
	public EntityManager getEntityManager() {
		return userDAOImpl.getEntityManager();
	}

	@Override
	public EntityTransaction getTransaction() {
		return userDAOImpl.getTransaction();
	}

}
