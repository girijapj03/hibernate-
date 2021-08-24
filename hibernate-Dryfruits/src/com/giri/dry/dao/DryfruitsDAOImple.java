package com.giri.dry.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.giri.dry.dto.DryfruitsDTO;

public class DryfruitsDAOImple implements DryfruitsDAO {

	@Override
	public int save(DryfruitsDTO dto) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(DryfruitsDTO.class);
		SessionFactory fact = cfg.buildSessionFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		int pk = (int) session.save(dto);
		trans.commit();
		System.out.println(pk);
		session.close();
		fact.close();
		return pk;

	}

}
