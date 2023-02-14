package com.jsp.hospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.jsp.hospital.dto.Branch;

public class BranchDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Nikita");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Branch createBranch(Branch branch) {
		entityTransaction.begin();
		entityManager.persist(branch);
		entityTransaction.commit();

		System.out.println("Branch Details Saved..");
		return branch;

	}

	public Branch getBranchByID(int id) {
		Branch b1 = entityManager.find(Branch.class, id);
		return b1;
	}

	public Branch deleteBranch(int id) {
		Branch b1 = entityManager.find(Branch.class, id);

		entityTransaction.begin();
		entityManager.remove(b1);
		entityTransaction.commit();

		System.out.println("Branch Details Deleted..");
		return b1;
	}

	public Branch updateBarnch(int id, String branchname, String branchloc) {
		Branch b1 = entityManager.find(Branch.class, id);

		if (b1 != null) {
			b1.setBranchName(branchname);
			b1.setBaranchloc(branchloc);
			entityTransaction.begin();
			entityManager.merge(b1);
			entityTransaction.commit();

		} else {
			System.out.println("Branch Details found..");

		}
		return b1;
	}
}
