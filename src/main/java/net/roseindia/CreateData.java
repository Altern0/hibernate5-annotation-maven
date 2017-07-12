package net.roseindia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import net.roseindia.model.*;

public class CreateData {
	
	public static void main(String[] args) throws Exception {

		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpName( "Al Perez" );
		emp.setEmpMobileNos( "000000" );
		emp.setEmpAddress( "Margarita - Venezuela" );
		
		session.save(emp);
		tr.commit();
		
		System.out.println("Successfully inserted");
		sessFact.close();
	}

}