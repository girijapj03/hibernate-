package com.giri.custom.dao;

import java.util.List;

import com.giri.custom.entity.CustomerEntity;

public interface CustomerDAO {
	void saveList(List<CustomerEntity> entity);
	
}
