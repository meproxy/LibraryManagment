package com.libraryManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository; 


import com.libraryManagment.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
