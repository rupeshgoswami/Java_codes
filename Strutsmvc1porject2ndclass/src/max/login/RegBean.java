package max.login;

import org.apache.struts.action.ActionForm;

public class RegBean extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String uid;
	String pass;
	String mob;
	String add;
	
	

	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	

}

