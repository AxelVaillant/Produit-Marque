package model;

import javax.faces.bean.ManagedBean;

import dao.ILogindao;
import dao.Logindao;

@ManagedBean(name="gl")
public class GestionLogin {

	private Login login = new Login();
	private ILogindao dao = new Logindao();
	
	
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public ILogindao getDao() {
		return dao;
	}

	public void setDao(ILogindao dao) {
		this.dao = dao;
	}

	public String ajoutlogin() {
		
		if(dao.saveLogin(login)==1)
		{
		return "succes";}
		else return "failed";

	}
	
	
	
	public String identification() {
		
		if(dao.ident(login)==true) {
			return "index";
		}
		else return "Login";
	}
}
