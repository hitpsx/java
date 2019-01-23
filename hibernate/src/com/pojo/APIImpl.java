package com.pojo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class APIImpl implements API{
	
	private SessionFactory sf;
	
	public APIImpl() {
		
	}
	public APIImpl(SessionFactory sf) {
		this.sf=sf;
	}
	public int getMainId(String name) {    //²éÑ¯
		Session s=sf.openSession();
		s.beginTransaction();
		
		Query query=s.createQuery("select id from Product where name = ?");
		query.setParameter(0, name);
		List<Integer> list=query.list();
		int id=list.get(0);
		
		s.getTransaction().commit();
		s.close();
		sf.close();
		return id;
	}
	public void add(Product p) {  //Ìí¼Ó
		Session s=sf.openSession();
		s.beginTransaction();
		
		s.save(p);
		s.getTransaction().commit();
		s.close();
		sf.close();
	}
	public void delete(String name) { //É¾³ý
		Session s=sf.openSession();
		s.beginTransaction();
		
		int id=getMainId(name);
		System.out.print(id);
		Product p =new Product();
		p=(Product)s.get(Product.class, id);
		s.delete(p);

		s.getTransaction().commit();
		s.close();
		sf.close();
	}
	public void change(String name,float age,String origin) { //Ìí¼Ó
		Session s=sf.openSession();
		s.beginTransaction();
		
		int id=getMainId(origin);
		Product p =new Product();
		p=(Product)s.get(Product.class, id);
		p.setName(name);
		p.setPrice(age);
		
		s.getTransaction().commit();
		s.close();
		sf.close();
	}
	public static void main(String args[]) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		APIImpl sd=new APIImpl(sf);

	}
	
}
