package com.utech.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utech.assignment.model.PersonDetails;
import com.utech.assignment.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;

	@PostMapping("/insertPersonData")
	public ResponseEntity<String> insertPersonData() {
		personService.insertPersonData();
		return new ResponseEntity<String>("Person Data Successfully Inserted", HttpStatus.OK);
	}

	@GetMapping("/findByCountryIdUSOnly/{countryId}") 
	public ResponseEntity<List<PersonDetails>> findByCountryId(@PathVariable String countryId) {

		return new ResponseEntity<List<PersonDetails>>(personService.findByCountryId(countryId), HttpStatus.OK);
	}

	@GetMapping("/findByQualifiedOrDisqualified/{qualifiedDisqualified}")
	public ResponseEntity<List<PersonDetails>> findByQualifiedOrDisqualified(
			@PathVariable String qualifiedDisqualified) {
		return new ResponseEntity<List<PersonDetails>>(
				personService.findByQualifiedOrDisqualified(qualifiedDisqualified), HttpStatus.OK);
	}

	@GetMapping("/findByScannedBy/{scannedBy}")
	public ResponseEntity<List<PersonDetails>> findByScannedBy(@PathVariable String scannedBy) {
		return new ResponseEntity<List<PersonDetails>>(personService.findByScannedBy(scannedBy), HttpStatus.OK);
	}

	

}
