package com.api;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.Product;

public class APIImpl implements API{
	
	private SessionFactory sf;
	
	public APIImpl() {
		
	}
	public APIImpl(SessionFactory sf) {
		this.sf=sf;
	}
	
	public Session init() {
		Session s=sf.openSession();
		s.beginTransaction();
		return s;
	}
	public void close(Session s) {
		s.close();
		sf.close();
	}
	public int getMainId(String name) {    //²éÑ¯

		Session s=init();
		Query query=s.createQuery("select id from Product where name = ?");
		query.setParameter(0, name);
		List<Integer> list=query.list();
		int id=list.get(0);
		
		s.getTransaction().commit();
		close(s);

		return id;
	}
	public void add(Product p) {  //Ìí¼Ó
		Session s=init();
		
		s.save(p);
		s.getTransaction().commit();
		close(s);
	}
	public void delete(String name) { //É¾³ý
		Session s=init();
		
		int id=getMainId(name);
		System.out.print(id);
		Product p =new Product();
		p=(Product)s.get(Product.class, id);
		s.delete(p);

		s.getTransaction().commit();
		close(s);
	}
	public void change(String name,float age,String origin) { //Ìí¼Ó
		Session s=init();
		
		int id=getMainId(origin);
		Product p =new Product();
		p=(Product)s.get(Product.class, id);
		p.setName(name);
		p.setPrice(age);
		
		s.getTransaction().commit();
		close(s);
	}
	public static void main(String args[]) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		APIImpl sd=new APIImpl(sf);
	}
	
}
