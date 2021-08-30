package com.giri.bird.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.giri.bird.entity.BirdEntity;
import com.giri.bird.util.SFUtil;

public class BirdDAOImple implements BirdDAO {

	@Override
	public int save(BirdEntity entity) {
	
		SessionFactory fact =SFUtil.getFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		int pk = (int) session.save(entity);
		trans.commit();
		System.out.println(pk);
		session.close();
		//fact.close();
		return pk;

	}

	@Override
	public BirdEntity read(BirdEntity entity) {
		SessionFactory fact =SFUtil.getFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		BirdEntity bird = session.get(BirdEntity.class, entity.getId());
		System.out.println(bird);
		trans.commit();
		session.close();
		return bird;
	}

	@Override
	public void update(int id,String name) {
		SessionFactory fact =SFUtil.getFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		BirdEntity bird = session.get(BirdEntity.class, id);
		bird.setName(name);;
		session.update(bird);
		System.out.println(bird);
		trans.commit();
		session.close();
		//fact.close();
		}

	@Override
	public void delete(int id) {
		SessionFactory fact =SFUtil.getFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		BirdEntity bird = session.get(BirdEntity.class, id);
		session.delete(bird);
		System.out.println("deleted :"+bird);
		trans.commit();
		session.close();
		}

}
