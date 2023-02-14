package com.jsp.hospital.service;

import com.jsp.hospital.dao.HospitalDao;
import com.jsp.hospital.dto.Hospital;

public class HospitalSrevice {
	HospitalDao hospitalDao = new HospitalDao();

	public Hospital createHospital(Hospital hospital) {
		return hospitalDao.createHospital(hospital);
	}

	public Hospital geHospitalById(int id) {
		return hospitalDao.getHospitalById(id);
	}

	public Hospital deleteHospitalById(int id) {
		return hospitalDao.deleteHospital(id);
	}

	public Hospital updateHospitalById(int id, String name, long lincenceno) {

		return hospitalDao.updateHospital(id, name, lincenceno);
	}
}
