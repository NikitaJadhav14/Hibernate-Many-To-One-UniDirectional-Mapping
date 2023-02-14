package com.jsp.hospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hospital.dto.Hospital;

public class HospitalDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Nikita");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Hospital createHospital(Hospital hospital) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();

		System.out.println("hospital Details Saved..");
		return hospital;

	}

	public Hospital getHospitalById(int id) {
		Hospital h1 = entityManager.find(Hospital.class, id);
		return h1;
	}

	public Hospital deleteHospital(int id) {
		Hospital h1 = entityManager.find(Hospital.class, id);

		entityTransaction.begin();
		entityManager.remove(h1);
		entityTransaction.commit();

		System.out.println("Hospital Details Deleted..");
		return h1;
	}

	public Hospital updateHospital(int id, String name, long lincenceno) {
		Hospital h1 = entityManager.find(Hospital.class, id);

		if (h1 != null) {
			h1.setName(name);
		    h1.setLincenceno(lincenceno);
			entityTransaction.begin();
			entityManager.merge(h1);
			entityTransaction.commit();

		} else {
			System.out.println("Hospital Details found..");

		}
		return h1;
	}
}
