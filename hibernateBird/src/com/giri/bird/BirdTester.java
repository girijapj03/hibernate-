package com.giri.bird;

import com.giri.bird.constants.BirdType;
import com.giri.bird.dao.BirdDAO;
import com.giri.bird.dao.BirdDAOImple;
import com.giri.bird.entity.BirdEntity;

public class BirdTester {

	public static void main(String[] args) {
		
		BirdEntity entity=new BirdEntity(9, "Dove", "white",30,1,true,true,"short",BirdType.LANDFOWL);
		BirdDAO dao=new BirdDAOImple();
		dao.save(entity);
		dao.read(entity);
		dao.update(3,"DUCK");
		dao.delete(8);
	}

}
