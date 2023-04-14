package com.libraryManagment.service;


import com.libraryManagment.entity.Lead;

import java.util.List;


public interface LeadService {
	
	public void saveLead(Lead lead);
	
	public List<Lead> getLeads();
}
