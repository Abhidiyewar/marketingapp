package com.marketingapp.services;

import java.util.List;

import com.marketingapp.entites.Lead;

public interface LeadService {

	public void Saveonelead(Lead l);

	public List<Lead> ListAllLeads();

	public void deleteLead(long id);

	public Lead UpdateByid(long id);



	
	
	
}
