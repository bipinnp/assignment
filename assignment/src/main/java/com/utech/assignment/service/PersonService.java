package com.utech.assignment.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utech.assignment.model.PersonDetails;
import com.utech.assignment.model.PersonGeneralInformation;
import com.utech.assignment.repository.PersonDetailsRepository;
import com.utech.assignment.repository.PersonGeneralInformationRepository;

@Service
public class PersonService {

	@Autowired
	private PersonDetailsRepository personDetailsRepository;

	@Autowired
	private PersonGeneralInformationRepository personGeneralInformationRepository;

	private static final String CSV_FILE_PATH = "src/main/resources/persons.csv";
	String line = " ";

	public void insertPersonData() {

		try {
			BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_PATH));

			try {
				br.readLine(); // this will read the first line
				while ((line = br.readLine()) != null) { // loop will run from 2nd line

					String[] data = line.split(",");

					PersonGeneralInformation personGeneralInformation = new PersonGeneralInformation(data[3], data[4],
							data[5], data[6], data[7]);

					PersonDetails personDetails = new PersonDetails(data[0], data[1], data[2], data[8], data[9],
							data[10], data[11], data[12], data[13], data[14], data[15], data[16], data[17], data[18],
							data[19], data[20], data[21], data[22], data[23], data[24], data[25]);

					// Set child reference(personDetails) in parent entity(personGeneralInformation)
					personGeneralInformation.setPersonDetails(personDetails);

					// Set parent reference(personGeneralInformation) in child entity(personDetails)
					personDetails.setPersonGeneralInformation(personGeneralInformation);

					// Save Parent Reference (which will save the child as well)
					personGeneralInformationRepository.save(personGeneralInformation);

				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public List<PersonDetails> findByCountryId(String countryId) {
		return personDetailsRepository.findByCountryId(countryId);

	}

	public List<PersonDetails> findByQualifiedOrDisqualified(String qualifiedDisqualified) {
		return personDetailsRepository.findByQualifiedDisqualified(qualifiedDisqualified);
	}

	public List<PersonDetails> findByScannedBy(String scannedBy) {
		return personDetailsRepository.findByScannedBy(scannedBy);
	}

	public List<PersonDetails> findAll() {
		return personDetailsRepository.findAll();
	}
	
	public List<PersonGeneralInformation> getPersonGeneralInfo() {
		return personGeneralInformationRepository.findAll();
	}

}
