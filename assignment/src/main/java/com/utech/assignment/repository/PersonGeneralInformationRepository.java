package com.utech.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utech.assignment.model.PersonGeneralInformation;

@Repository
public interface PersonGeneralInformationRepository extends JpaRepository<PersonGeneralInformation, Long>{

	
}
