package com.giri.soap.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.giri.soap.dto.SoapDTO;

public class SoapDAOIMple implements SoapDAO {

	@Override
	public int save(SoapDTO dto) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(SoapDTO.class);
		SessionFactory fact = cfg.buildSessionFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		int pk = (int) session.save(dto);
		// trans.commit();
		System.out.println(pk);
		session.close();
		fact.close();
		return pk;
	}

	@Override
	public boolean read(int id) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(SoapDTO.class);
		SessionFactory fact = cfg.buildSessionFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();

		SoapDTO soap = session.get(SoapDTO.class, id);
		System.out.println(soap);

		trans.commit();
		session.close();
		fact.close();
		return false;

	}

	@Override
	public int update(SoapDTO dto) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(SoapDTO.class);
		SessionFactory fact = cfg.buildSessionFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();

		SoapDTO soap = session.get(SoapDTO.class, 1);
		soap.setBrandAmbassador("Alexa");
		session.saveOrUpdate(soap);
		System.out.println(soap);

		trans.commit();
		session.close();
		fact.close();
		return 0;
	}

	@Override
	public boolean delete(SoapDTO dto) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(SoapDTO.class);
		SessionFactory fact = cfg.buildSessionFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();

		SoapDTO soap = session.get(SoapDTO.class, 1);
		if (dto != null) {
			session.delete(soap);
			System.out.println("deleted");
		}
		System.out.println(soap);

		trans.commit();
		session.close();
		fact.close();

		return false;
	}

}
