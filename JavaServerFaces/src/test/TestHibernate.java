package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import POJOs.Actividades;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actividades act = new Actividades();
		act.setId(2);
		act.setDescrption("act2");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		act = (Actividades)session.get(Actividades.class, 2);
		System.out.println(act.getDescrption());
		//session.save(act);
		//session.getTransaction().commit();
	}

}
