package com.jsp.hospital.controller;

import com.jsp.hospital.service.BranchService;
import com.jsp.hospital.service.HospitalSrevice;

public class UpdateController {

	public static void main(String[] args) {
		BranchService branchService = new BranchService();
		branchService.updateBranchById(3, " D.Y.Patil", "pune");

		HospitalSrevice hospitalSrevice = new HospitalSrevice();
		hospitalSrevice.updateHospitalById(2, "KEM", 2246);

	}

}
