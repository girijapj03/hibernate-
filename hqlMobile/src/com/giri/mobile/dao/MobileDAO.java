package com.giri.mobile.dao;

import com.giri.mobile.entity.MobileEntity;

public interface MobileDAO {
	int save(MobileEntity entity);
	void updatePriceByColor();
    void deleteRowById();
    void getAllRecords();
	double getMobilePriceByBrand(String brand);
    double getTotal(); 
    double getMaximumPrice();
    double getMinimumPrice();
    
}
