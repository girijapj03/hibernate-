package com.giri.custom.dao;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.giri.custom.entity.CustomerEntity;
import com.giri.custom.util.SFUtil;

public class CustomerDAOImple implements CustomerDAO {
	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public void saveList(List<CustomerEntity> entity) {
		try (Session session = factory.openSession()) {
			Transaction trans = session.beginTransaction();
			AtomicInteger atomicInteger = new AtomicInteger();
			entity.forEach(list -> {
				CustomerEntity customer = session.load(CustomerEntity.class, list.getId());
				if (customer != null) {
					session.save(list);
					System.out.println(list);
				}
				if (atomicInteger.incrementAndGet() % 10 == 0) {
					session.flush();
				}
			});
			trans.commit();
		}

	}

}
