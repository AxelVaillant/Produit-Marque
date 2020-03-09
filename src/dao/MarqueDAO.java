package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Marque;
import model.Produit;

public class MarqueDAO implements IMarquedao {
	SessionFactory factory = ConnexionDB.getInstance().getFactory();
	@Override
	public int saveMarque(Marque m) {
		try {
			
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(m);
			session.getTransaction().commit();
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("erreur dans la méthode saveMarque");
		return 0;
	}

	
}

	@Override
	public List<Marque> getMarques() {
		try {
			Session session = factory.openSession(); 
			session.beginTransaction();
			List<Marque> listem=new ArrayList<Marque>();
			listem=session.createQuery("from Marque").list();
			return listem;
				
			} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("erreur dans methode getmarques");
			return null;
	}}}
