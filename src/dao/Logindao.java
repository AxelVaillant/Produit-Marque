package dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Login;

public class Logindao implements ILogindao {
	SessionFactory factory = ConnexionDB.getInstance().getFactory();
	@Override
	public int saveLogin(Login login) {

try {
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(login);
			session.getTransaction().commit();
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("erreur dans la méthode saveLogin");
		return 0;
	}}

	@Override
	public boolean ident(Login login) {
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			Query query=session.createQuery("from Login where identifiant = :identifiant and mdp = :mdp");
			query.setParameter("identifiant", login.getIdentifiant());
			query.setParameter("mdp", login.getMdp());
			if(query.uniqueResult()!=null) {
			return true;
			}
			else {
				return false;
			}

		}
			catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Erreur dans la méthode ident");
			return false;
		}

	}

}
