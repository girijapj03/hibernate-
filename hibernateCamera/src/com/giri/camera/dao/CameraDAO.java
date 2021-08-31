package com.giri.camera.dao;

import com.giri.camera.entity.CameraEntity;

public interface CameraDAO {
	int save(CameraEntity entity);
	CameraEntity read(CameraEntity entity);
	void update(int id,String brand);
	void  delete(int id);
}
