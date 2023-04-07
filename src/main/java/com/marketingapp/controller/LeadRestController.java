package com.marketingapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketingapp.entites.Lead;
import com.marketingapp.repositories.LeadRepository;

@RestController     // this will act like a web services 
@RequestMapping("/api/leads")
public class LeadRestController {

	@Autowired
	private LeadRepository leadRepo;
	
	@GetMapping    // this will get all the data from the database as JSON object this annotation is used to get the data from database
	public List<Lead> getAllLeads(){
		List<Lead> leads = leadRepo.findAll();
		
		return leads;
		
	}
	
	@PostMapping         // to save the record in database
	public void SaveLead(@RequestBody Lead leads) {
		leadRepo.save(leads);
		
	}
	@PutMapping         // to save the record in database
	public void updateLead(@RequestBody Lead leads) {
		leadRepo.save(leads);
		
	}

	//http:localhost:8080/api/leads/delete/20
	
	@DeleteMapping("/delete/{id}")       // used to delete a record from a database
	public void DeleteLead(@PathVariable("id") long id) {
		leadRepo.deleteById(id);
		
	}
	
	@RequestMapping("/lead/{id}")
	public Lead GetOneLead(@PathVariable("id") long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
		
	}
	
}


//localhost:8080/api/leads