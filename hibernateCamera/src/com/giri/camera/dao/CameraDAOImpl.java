package com.giri.camera.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.giri.camera.entity.CameraEntity;
import com.giri.camera.util.SessionFactUtil;


public class CameraDAOImpl implements CameraDAO {
	private SessionFactory factory = SessionFactUtil.getFactory();

	@Override
	public int save(CameraEntity entity) {
		try (Session session = factory.openSession()) {
			Transaction trans = session.beginTransaction();
			int key = (int) session.save(entity);
			trans.commit();
			return key;
		}
	}

	@Override
	public CameraEntity read(CameraEntity entity) {
		try (Session session = factory.openSession()) {
			Transaction trans = session.beginTransaction();
			CameraEntity cam = session.get(CameraEntity.class, entity.getId());
			trans.commit();
			return cam;
		}
	}

	@Override
	public void update(int id, String brand) {
		try (Session session = factory.openSession()) {
			Transaction trans = session.beginTransaction();
			CameraEntity cam = session.get(CameraEntity.class, id);
			cam.setBrand(brand);
			trans.commit();
		}
	}

	@Override
	public void delete(int id) {
		try (Session session = factory.openSession()) {
			Transaction trans = session.beginTransaction();
			CameraEntity cam = session.get(CameraEntity.class, id);
			session.delete(cam);
			trans.commit();
		}
	}

	@Override
	public void saveList(List<CameraEntity> list) {
     try (Session session = factory.openSession()) {
			System.out.println("stared");
			Transaction trans = session.beginTransaction();
			list.forEach(l -> {
				session.save(l);
				System.out.println(l);
			});
			trans.commit();
		} catch (HibernateException e) {
			e.printStackTrace();

		}
	}

	@Override
	public void deleteList(List<Integer> ids) {
		try (Session session = factory.openSession()) {
			System.out.println("stared");
			Transaction trans = session.beginTransaction();
			ids.forEach(del -> {
				CameraEntity cam = session.get(CameraEntity.class, del);
				session.delete(del);
				System.out.println("deleting "+del);
			});
			trans.commit();

		}
	}

	@Override
	public void deletList(List<CameraEntity> entity) {
		try (Session session = factory.openSession()) {
			System.out.println("stared");
			Transaction trans = session.beginTransaction();
			Iterator<CameraEntity> itList = entity.iterator();
		    while(itList.hasNext()) {
		        CameraEntity emp = itList.next();
		        session.delete(emp);
		       System.out.println("deleted");
		    }
			trans.commit();
		
	}
}

	@Override
	public CameraEntity getAllByQuery() {
		try (Session session = factory.openSession()) {
			System.out.println("stared");
			Transaction trans = session.beginTransaction();
			Query query=session.createQuery("from CameraEntity");
			List<CameraEntity> list=query.getResultList();
			System.out.println(list);
		return null;
	}
}
}
