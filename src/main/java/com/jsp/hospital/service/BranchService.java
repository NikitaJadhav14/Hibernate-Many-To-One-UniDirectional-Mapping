package com.jsp.hospital.service;

import com.jsp.hospital.dao.BranchDao;
import com.jsp.hospital.dto.Branch;

public class BranchService {
	BranchDao branchDao = new BranchDao();

	public Branch createBranch(Branch branch) {
		return branchDao.createBranch(branch);

	}

	public Branch geBranchById(int id) {
		return branchDao.getBranchByID(id);

	}

	public Branch deleteBranchById(int id) {
		return branchDao.deleteBranch(id);
	}

	public Branch updateBranchById(int id, String branchname, String branchloc) {

		return branchDao.updateBarnch(id, branchname, branchloc);
	}
}
