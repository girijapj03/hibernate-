package com.giri.soap.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.giri.soap.dto.SoapDTO;


public class SoapDAOIMple implements SoapDAO {

	@Override
	public int save(SoapDTO dto) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(SoapDTO.class);
		SessionFactory fact=cfg.buildSessionFactory();
		 Session session=fact.openSession();
		  Transaction trans=session.beginTransaction();
		  int pk=(int) session.save(dto);
		  trans.commit();
		  System.out.println(pk);
		  session.close();
		  fact.close();
		return pk;
		
	}

}
