package com.giri.camera.dao;

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
}
