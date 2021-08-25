package com.giri.soap;

import com.giri.soap.constants.SoapType;
import com.giri.soap.dao.SoapDAO;
import com.giri.soap.dao.SoapDAOIMple;
import com.giri.soap.dto.SoapDTO;

public class SoapTester {

	public static void main(String[] args) {
		SoapDTO dto = new SoapDTO(2, "XYZ", "LEMON", true, true, SoapType.DETERGENT);
		SoapDAO dao = new SoapDAOIMple();
		dao.save(dto);
		dao.read(2);
		dao.update(dto);
		dao.delete(dto);
	}

}
