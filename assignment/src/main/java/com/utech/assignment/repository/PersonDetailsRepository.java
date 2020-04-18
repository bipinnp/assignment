package com.utech.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utech.assignment.model.PersonDetails;

@Repository
public interface PersonDetailsRepository extends JpaRepository<PersonDetails, Long> {
	
	List<PersonDetails> findByCountryId(String countryId);
	
	List<PersonDetails> findByQualifiedDisqualified(String qualifiedDisqualified);
	
	List<PersonDetails> findByScannedBy(String scannedBy);
}
