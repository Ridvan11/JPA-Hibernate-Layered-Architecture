package _02.dynamic.navigator;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.omg.PortableInterceptor.SUCCESSFUL;

@ManagedBean(name="dynamicNavigationBean")
@SessionScoped
public class DynamicNavigationBean {

	private String name;
	private String password;

	private int counter = 0;
	private boolean locked = false;

	public String login() {

		if ("simay".equals(name) && "ridvan".equals(password)) {
			counter = 0;
			locked = false;
			return "ridvan";
		}

		counter++;
		if (locked) {
			return "locked";
		}

		return "failure";
	}
	
	/*public String Login2(){
		EntityTransaction entr=em.getTransaction();
        entr.begin();
	
		
		TypedQuery<DynamicNavigationBean> query = em.createQuery("SELECT c FROM User c WHERE c.clientID = :id AND c.password = :pass", DynamicNavigationBean.class);
	    query.setParameter("id", CID);
	    query.setParameter("pass", password); 
	    try{ 
	    	DynamicNavigationBean c = query.getSingleResult();
	    	return "success";
	}
	    catch {
	    	return "failure";
	    }*/
	public String checkCounter(){
		if(counter>3){
			locked=true;
			return "locked";
		}else {
			return "retry";
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}
}
