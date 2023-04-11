package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.DepartementReposiory;
import com.example.demo.entities.Departement;
@Service
public class DepartementServiceImpl implements DepartementService {
	
	@Autowired
	DepartementReposiory departementRepository;
	@Override
	public void createDepartement(Departement d) {
		this.departementRepository.save(d);
		
	}

	@Override
	public List<Departement> findDepartements() {
		return departementRepository.findAll();
	}

	@Override
	public Departement findOneDepartement(long id) {
		return this.departementRepository.findById(id).get();
	}

}