package com.giri.mobile;

import com.giri.mobile.dao.MobileDAO;
import com.giri.mobile.dao.MobileDAOImple;
import com.giri.mobile.entity.MobileEntity;

public class MobileTester {

	public static void main(String[] args) {
		MobileEntity entity=new MobileEntity(32000,"blue",true,"Redmi");
		MobileEntity entity2=new MobileEntity(17000,"Red",true,"vivo");
		MobileEntity entity3=new MobileEntity(35000,"Sky-blue",true,"Real-me");
		MobileDAO dao=new MobileDAOImple();
		dao.save(entity);
		dao.save(entity2);
		dao.save(entity3);
		dao.getAllRecords();
		
		System.out.println("Maximum price :"+dao.getMinimumPrice());
		System.out.println("Minimum price :"+dao.getMaximumPrice());
		System.out.println("Total Price :"+dao.getTotal());
		System.out.println("Get mobile peice :"+dao.getMobilePriceByBrand("Redmi"));
		dao.deleteRowById();
		dao.updatePriceByColor();
	}

}
