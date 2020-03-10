package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
@Id
	private String identifiant;
	private String mdp;
	public Login(String identifiant, String mdp) {
		super();
		this.identifiant = identifiant;
		this.mdp = mdp;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	@Override
	public String toString() {
		return "Login [identifiant=" + identifiant + ", mdp=" + mdp + "]";
	}
	
}
