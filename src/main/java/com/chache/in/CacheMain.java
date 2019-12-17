package com.chache.in;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CacheMain {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(104);
		s1.setName("aryys");
		s1.setMarks(55);
		Configuration conn=new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf=conn.buildSessionFactory();
		Session session1= sf.openSession();
		Transaction tx=session1.beginTransaction();
		session1.save(s1);
		s1=(Student)session1.get(Student.class, 101);
		session1.close();
		tx.commit();;
		System.out.println(s1);
		
		/*Session session2= sf.openSession();
		Transaction tx2=session2.beginTransaction();
		session2.save(s1);
		s1=(Student)session2.get(Student.class, 101);
		session2.close();
		tx2.commit();
		*/
		
		
	}

}
