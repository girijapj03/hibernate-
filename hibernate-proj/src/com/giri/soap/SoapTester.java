package com.giri.soap;

import com.giri.soap.constants.SoapType;
import com.giri.soap.dao.SoapDAO;
import com.giri.soap.dao.SoapDAOIMple;
import com.giri.soap.dto.SoapDTO;

public class SoapTester {

	public static void main(String[] args) {
		SoapDTO dto=new SoapDTO(1,"Bello","neem",true,true,SoapType.HUMAN);
		SoapDAO dao=new SoapDAOIMple();
		dao.save(dto);

	}

}
