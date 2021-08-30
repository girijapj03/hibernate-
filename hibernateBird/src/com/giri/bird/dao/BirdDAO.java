package com.giri.bird.dao;

import com.giri.bird.entity.BirdEntity;

public interface BirdDAO {
	int save(BirdEntity entity);
	BirdEntity read(BirdEntity entity);
	void update(int id,String name);
	void  delete(int id);

}
