package com.marketingapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp.entites.Lead;
import com.marketingapp.repositories.LeadRepository;

@Service
public class LeadServiceimpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void Saveonelead(Lead l) {
		leadRepo.save(l);

	}

	@Override
	public List<Lead> ListAllLeads() {
		 List<Lead> leads = leadRepo.findAll();
		 return leads;
		
	}

	@Override
	public void deleteLead(long id) {
		leadRepo.deleteById(id);
		
	}

	@Override
	public Lead UpdateByid(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead leads = findById.get();
		return leads;
	}

	

}































