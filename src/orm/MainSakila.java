package orm;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainSakila {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();
		
		Customer c = session.find(Customer.class, 1L);
		System.out.println(c.getId() + " " + c.getFirstName() + " " + c.getLastName());
		
		Customer c2 = new Customer();
		
		c2.setFirstName("Muxette");
		c2.setEmail("muxette@chat.so");
		c2.setLastName("Chat");
		c2.setStoreId(1L);
		c2.setAddress_id(544L);
		
		session.getTransaction().begin();
		session.persist(c2);
		Customer c599 = session.find(Customer.class, 599L);
		c599.setFirstName("TESTc599");

		session.remove(c2);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}

}
