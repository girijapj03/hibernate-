package com.giri.dry;

import com.giri.dry.dao.DryfruitsDAO;
import com.giri.dry.dao.DryfruitsDAOImple;
import com.giri.dry.dto.DryfruitsDTO;

public class DryfruitsTESTER {

	public static void main(String[] args) {
		DryfruitsDTO dto=new DryfruitsDTO(12,"walnut","Superior","Africa",1000,"Shops");
		DryfruitsDAO dao=new DryfruitsDAOImple();
		dao.save(dto);
	}

}
