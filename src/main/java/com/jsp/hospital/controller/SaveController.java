package com.jsp.hospital.controller;

import com.jsp.hospital.dto.Branch;
import com.jsp.hospital.dto.Hospital;
import com.jsp.hospital.service.BranchService;
import com.jsp.hospital.service.HospitalSrevice;

public class SaveController {

	public static void main(String[] args) {
		HospitalSrevice hospitalSrevice = new HospitalSrevice();
		BranchService branchService = new BranchService();

		Hospital hospital = new Hospital();
		hospital.setName("J.J");
		hospital.setLincenceno(1234);
		hospitalSrevice.createHospital(hospital);

		Branch branch = new Branch();
		branch.setBranchName("KEM11");
		branch.setBaranchloc("Vashi");
		branchService.createBranch(branch);

		Branch branch2 = new Branch();
		branch2.setBranchName("KEM12");
		branch2.setBaranchloc("pune");
		branchService.createBranch(branch2);

		Branch branch3 = new Branch();
		branch3.setBranchName("kEM13");
		branch3.setBaranchloc("panvel");
		branchService.createBranch(branch3);

	}

}
