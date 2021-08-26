package com.giri.bird.dao;

import com.giri.bird.entity.BirdEntity;

public interface BirdDAO {
	int save(BirdEntity entity);
	void read(BirdEntity entity);
	BirdEntity update(int id);
	BirdEntity delete(int id);

}
