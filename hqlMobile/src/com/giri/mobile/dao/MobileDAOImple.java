package com.giri.mobile.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.giri.mobile.entity.MobileEntity;
import com.giri.mobile.util.SFUtil;

public class MobileDAOImple implements MobileDAO {
	private SessionFactory factory = SFUtil.getFactory();
	Transaction transaction = null;

	@Override
	public int save(MobileEntity entity) {
		int key = 0;
		try (Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			key = (int) session.save(entity);
			session.flush();
			transaction.commit();
			return key;
		}
	}

	@Override
	public void updatePriceByColor() {
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("updateBrandByPrice");
			session.beginTransaction();
			query.executeUpdate();
			session.getTransaction().commit();
			System.out.println("Updated****");
		}
	}

	@Override
	public void deleteRowById() {
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("deleteById");
			session.beginTransaction();
			query.executeUpdate();
			session.getTransaction().commit();
			System.out.println("deleted**");
		}
	}

	@Override
	public void getAllRecords() {
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("readAll");
			List<MobileEntity> list = query.list();
			for (MobileEntity mobileEntity : list) {
				System.out.println(mobileEntity);
			}
		}
	}

	@Override
	public double getMobilePriceByBrand(String brand) {
		double mobilePrice = 0;
		try (Session session = factory.openSession()) {
			Query query = session.createQuery("readPriceByBrand");
			Object object = query.uniqueResult();
			if (object != null) {
				mobilePrice = (double) object;
			}
		}
		return mobilePrice;
	}

	@Override
	public double getTotal() {
		double mobilePrice = 0;
		try (Session session = factory.openSession()) {
			Query query = session.createQuery("findTotalPrice");
			Object obj = query.uniqueResult();
			if (obj != null) {
				mobilePrice = (double) obj;
			}
		}
		return mobilePrice;
	}

	@Override
	public double getMaximumPrice() {
		double mobilePrice = 0;
		try (Session session = factory.openSession()) {
			Query query = session.createQuery("findMaxPrice");
			Object object = query.uniqueResult();
			if (object != null) {
				mobilePrice = (double) object;
			}
		}
		return mobilePrice;
	}

	@Override
	public double getMinimumPrice() {
		double mobilePrice = 0;
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("findMinPrice");
			Object obj = query.uniqueResult();
			if (obj != null) {
				mobilePrice = (double) obj;
			}
		}
		return mobilePrice;
	}

}
