package com.giri.soap.dao;

import com.giri.soap.dto.SoapDTO;

public interface SoapDAO {
int save(SoapDTO dto);
boolean read(int id);
int update(SoapDTO dto);
boolean delete(SoapDTO dto);
}
