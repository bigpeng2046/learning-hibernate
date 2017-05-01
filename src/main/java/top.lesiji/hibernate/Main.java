package top.lesiji.hibernate;

import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.setId(1);
		person.setName("Le Siji");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(person);
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Done");
	}
} 
