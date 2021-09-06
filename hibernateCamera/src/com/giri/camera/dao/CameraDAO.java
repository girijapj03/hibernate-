package com.giri.camera.dao;

import java.util.List;

import com.giri.camera.entity.CameraEntity;

public interface CameraDAO {
	int save(CameraEntity entity);
	CameraEntity read(CameraEntity entity);
	void update(int id,String brand);
	void  delete(int id);
	void saveList(List<CameraEntity> entity);
	void deletList(List<CameraEntity> entity);
	void deleteList(List<Integer> ids);
	CameraEntity getAllByQuery();
}
