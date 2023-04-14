package com.libraryManagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryManagment.entity.Lead;
import com.libraryManagment.repository.LeadRepository;




@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
	}

	
	@Override
	public List getLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}


	
}
