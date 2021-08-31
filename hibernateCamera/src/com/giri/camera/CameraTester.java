package com.giri.camera;

import com.giri.camera.dao.CameraDAO;
import com.giri.camera.dao.CameraDAOImpl;
import com.giri.camera.entity.CameraEntity;

public class CameraTester {

	public static void main(String[] args) {
		CameraEntity entity=new CameraEntity("samsung s9",20.1,"Samsung","LCD",1280,25,"ABCD","china",true);
		CameraEntity entity1=new CameraEntity("Sony a11",24.2,"Sony","LCD",2288,25,"senorrita","china",true);
        CameraDAO dao=new CameraDAOImpl();
        dao.save(entity);
        dao.save(entity1);
        dao.read(entity);
        dao.update(1,"Sony a6");
        dao.delete(5);
	}

}
