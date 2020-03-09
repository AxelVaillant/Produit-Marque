package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Marque {
@Id
@GeneratedValue
	private  int idmarque;
	private String nommarque;
	@Temporal(TemporalType.DATE)
	private Date datecreation;
	public Marque(int idmarque, String nommarque, Date datecreation) {
		super();
		this.idmarque = idmarque;
		this.nommarque = nommarque;
		this.datecreation = datecreation;
	}
	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdmarque() {
		return idmarque;
	}
	public void setIdmarque(int idmarque) {
		this.idmarque = idmarque;
	}
	public String getNommarque() {
		return nommarque;
	}
	public void setNommarque(String nommarque) {
		this.nommarque = nommarque;
	}
	public Date getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	@Override
	public String toString() {
		return "Marque [idmarque=" + idmarque + ", nommarque=" + nommarque + ", datecreation=" + datecreation + "]";
	}
	
	
}
