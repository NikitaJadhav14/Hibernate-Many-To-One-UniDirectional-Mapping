package com.jsp.hospital.controller;

import com.jsp.hospital.service.BranchService;
import com.jsp.hospital.service.HospitalSrevice;

public class DetailController {

	public static void main(String[] args) {
		HospitalSrevice hospitalSrevice = new HospitalSrevice();
		hospitalSrevice.geHospitalById(1);

		BranchService branchService = new BranchService();
		branchService.geBranchById(1);

	}

}
