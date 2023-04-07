package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.entites.Lead;
import com.marketingapp.services.LeadService;
import com.marketingapp.util.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private EmailService emailService;
	
	
	@Autowired
	private LeadService leadService;

	//http:localhost:3306/ViewLeadPage/
	@RequestMapping(value = "/ViewLeadPage")
	public String ViewLeadPage() {

		return"create_lead";
	}
	
	@RequestMapping(value = "/SaveLead" ,method = RequestMethod.POST)
	public String SaveLead(@ModelAttribute("leads")Lead l, ModelMap model) {
		leadService.Saveonelead(l);
		emailService.SendEmail(l.getEmail(), "Testing of project", "Welcome to the Future..!!");
		model.addAttribute("msg", "Record Save Zhala..!");
		return"create_lead";
	}
	
	@RequestMapping("/ListAll")
	public String ListAll(ModelMap model) {
		List<Lead> leads = leadService.ListAllLeads();
		model.addAttribute("leads", leads);
		return "ListAll";
		
	}
	
	@RequestMapping("/deletelead")
	public String DeleteLead(@RequestParam("id")long id, ModelMap model) {
		leadService.deleteLead(id);
		List<Lead> leads = leadService.ListAllLeads();
		model.addAttribute("leads", leads);
		return"ListAll";
	}
	
	@RequestMapping("/updatelead")
	public String UpdateLead(@RequestParam("id")long id, Model model) {
		Lead leads = leadService.UpdateByid(id);
		model.addAttribute("lead", leads);
		return"update";
	}
	
	@RequestMapping(value = "/UpdateLead" ,method = RequestMethod.POST)
	public String UpdateOneLead(@ModelAttribute("leads")Lead l, ModelMap model) {
		leadService.Saveonelead(l);
		List<Lead> leads = leadService.ListAllLeads();
		model.addAttribute("leads", leads);
		return"ListAll";
	}
}





























