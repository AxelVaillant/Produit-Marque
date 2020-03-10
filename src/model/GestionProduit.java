package model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.IMarquedao;
import dao.IProduit;
import dao.MarqueDAO;
import dao.ProduitDAO;
@ManagedBean(name="gp")
public class GestionProduit {

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public IProduit getDao() {
		return dao;
	}

	public void setDao(IProduit dao) {
		this.dao = dao;
	}

	private Produit produit = new Produit();
	private IProduit dao = new ProduitDAO();
	
	public String ajoutProduit() {
		produit.setMarque(marque);
		if(dao.saveProduct(produit)==1) {
		return "succes";
	}
		else return "failed";
	}
	private Marque marque= new Marque();
	private IMarquedao daom=new MarqueDAO();
	
	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public IMarquedao getDaom() {
		return daom;
	}

	public void setDaom(IMarquedao daom) {
		this.daom = daom;
	}

	public String ajoutMarque() {
		if(daom.saveMarque(marque)==1) {
		return "succes";
	}
		else return "failed";
	}
	public List<Marque> listMarques() { 
		List<Marque> list= daom.getMarques();
		return list;

	}
	public List<Produit> listProduits() { 
		return dao.getProducts();
		
	}

}
