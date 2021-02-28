package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class BaseDAO {
	public SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	public Session getSession(){
		Session session = sessionFactory.getCurrentSession();
		return session;
 	}
}
