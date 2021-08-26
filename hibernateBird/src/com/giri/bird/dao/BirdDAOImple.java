package com.giri.bird.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.giri.bird.entity.BirdEntity;

public class BirdDAOImple implements BirdDAO {

	@Override
	public int save(BirdEntity entity) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory fact = cfg.buildSessionFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		int pk = (int) session.save(entity);
		trans.commit();
		System.out.println(pk);
		session.close();
		fact.close();
		return pk;

	}

	@Override
	public void read(BirdEntity entity) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory fact = cfg.buildSessionFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		BirdEntity bird = session.get(BirdEntity.class, entity.getId());
		System.out.println(bird);
		trans.commit();
		session.close();
		fact.close();
	}

	@Override
	public BirdEntity update(int id) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory fact = cfg.buildSessionFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		BirdEntity bird = session.get(BirdEntity.class, id);
		bird.setLifespan(3);
		session.update(bird);
		System.out.println(bird);
		trans.commit();
		session.close();
		fact.close();
		return bird;
	}

	@Override
	public BirdEntity delete(int id) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory fact = cfg.buildSessionFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		BirdEntity bird = session.get(BirdEntity.class, id);
		session.delete(bird);
		System.out.println("deleted :"+bird);
		trans.commit();
		session.close();
		fact.close();
		return bird;
	}

}
