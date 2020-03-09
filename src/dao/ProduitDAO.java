package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Marque;
import model.Produit;

public class ProduitDAO implements IProduit {
	SessionFactory factory = ConnexionDB.getInstance().getFactory();
	@Override
	public int saveProduct(Produit p) {
		try {
		
			Session session = factory.openSession(); 
			session.beginTransaction();
			session.save(p);
			session.getTransaction().commit();
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("erreur dans la méthode saveProduct");
		return 0;
	}

}

	@Override
	public List<Produit> getProducts() {
		try {
		Session session = factory.openSession(); 
		session.beginTransaction();
		List<Produit> liste=new ArrayList<Produit>();
		liste=session.createQuery("from Produit").list();
		return liste;
			
		} catch (HibernateException e) {
		e.printStackTrace();
		System.out.println("erreur dans methode getproducts");
		return null;
		}	}

	@Override
	public List<Produit> getProducts(Marque marque) {
		// TODO Auto-generated method stub
		return null;
	}}
