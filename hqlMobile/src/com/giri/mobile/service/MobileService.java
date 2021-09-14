package com.giri.mobile.service;

import com.giri.mobile.entity.MobileEntity;

public interface MobileService {
	int validateAndSave(MobileEntity entity);

	void validateAndReadAll();

	double validateAndreadPriceByBrand(String brand);

	double validateAndfindMaxPrice();

	double validateAndfindMinPrice();

	double validateAndfindTotalPrice();

	void validateAndDeleteById(int id);

}
