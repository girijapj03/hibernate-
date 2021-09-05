package com.giri.custom;

import java.util.ArrayList;
import java.util.List;

import com.giri.custom.dao.CustomerDAO;
import com.giri.custom.dao.CustomerDAOImple;
import com.giri.custom.entity.CustomerEntity;

public class CustomerTester {

	public static void main(String[] args) {
		CustomerDAO dao = new CustomerDAOImple();

		List<CustomerEntity> list = new ArrayList<>();
		for (int i = 1; i <= 30; i++) {
			CustomerEntity entity = new CustomerEntity(i, "Pinky", "Belguam", "Dubai", "Indra nagar", 12345, "BE",
					true);
			list.add(entity);
		}
		dao.saveList(list);

	}

}
