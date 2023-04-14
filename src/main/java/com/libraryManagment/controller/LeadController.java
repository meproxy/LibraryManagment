package com.libraryManagment.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.libraryManagment.entity.Lead;
import com.libraryManagment.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;

	//http://localhost:8080/view    (to feed data)
	@RequestMapping("/view") // it acts like @webServelet
	private String viewLeadPage() {
		// displaying view page
		return "create_lead"; // it acts like a request dispatcher 
	}
	
	//http://localhost:8080/saveLead    (
	@RequestMapping("/saveLead") //will be called by save data page
	public String saveOneLead(Lead lead, Model model) {
//		System.out.println(lead.getFirstName());
//		System.out.println(lead.getLastName());
//		System.out.println(lead.getEmail());
//		System.out.println(lead.getMobile());
		
		//calling saveLead at model layer to save at DB
		leadService.saveLead(lead);
		
		//for displaying saved msg
		model.addAttribute("msg","saved"); //acts like set attribute
		
		return "create_lead"; // will return back to same page
	}
	
//	http://localhost:8080/listall
	@RequestMapping("/listall")
	public String getAllLeads(Model model) {
		List<Lead> leads = leadService.getLeads();
		model.addAttribute("leads", leads);
		System.out.println(leads);
		return "list_leads";
	}
}
