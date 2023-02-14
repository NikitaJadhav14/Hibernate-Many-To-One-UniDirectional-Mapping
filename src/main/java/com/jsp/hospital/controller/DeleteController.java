package com.jsp.hospital.controller;

import com.jsp.hospital.service.BranchService;
import com.jsp.hospital.service.HospitalSrevice;

public class DeleteController {

	public static void main(String[] args) {
		HospitalSrevice hospitalSrevice = new HospitalSrevice();
		hospitalSrevice.deleteHospitalById(1);

		BranchService branchService = new BranchService();
		branchService.deleteBranchById(2);

	}

}
