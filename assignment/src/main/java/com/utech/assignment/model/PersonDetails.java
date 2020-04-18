package com.utech.assignment.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "PersonDetails")
public class PersonDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String eventName;
	private String scannedDate;
	private String scannedTime;
	private String companyName;
	private String jobTitle;
	private String address1;
	private String address2;
	private String address3;
	private String city;
	private String stateId;
	private String zip;
	private String countryId;
	private String phoneNumber;
	private String phoneNumber2;
	private String faxNumber;
	private String question;
	private String response;
	private String note;
	private String collateral;
	private String qualifiedDisqualified;
	private String scannedBy;

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "personGeneralInfoId", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnoreProperties("personDetails")
	private PersonGeneralInformation personGeneralInformation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getScannedDate() {
		return scannedDate;
	}

	public void setScannedDate(String scannedDate) {
		this.scannedDate = scannedDate;
	}

	public String getScannedTime() {
		return scannedTime;
	}

	public void setScannedTime(String scannedTime) {
		this.scannedTime = scannedTime;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber2() {
		return phoneNumber2;
	}

	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getCollateral() {
		return collateral;
	}

	public void setCollateral(String collateral) {
		this.collateral = collateral;
	}

	public String getQualifiedDisqualified() {
		return qualifiedDisqualified;
	}

	public void setQualifiedDisqualified(String qualifiedDisqualified) {
		this.qualifiedDisqualified = qualifiedDisqualified;
	}

	public String getScannedBy() {
		return scannedBy;
	}

	public void setScannedBy(String scannedBy) {
		this.scannedBy = scannedBy;
	}

	public PersonGeneralInformation getPersonGeneralInformation() {
		return personGeneralInformation;
	}

	public void setPersonGeneralInformation(PersonGeneralInformation personGeneralInformation) {
		this.personGeneralInformation = personGeneralInformation;
	}

	public PersonDetails() {

	}

	public PersonDetails(String eventName, String scannedDate, String scannedTime, String companyName, String jobTitle,
			String address1, String address2, String address3, String city, String stateId, String zip,
			String countryId, String phoneNumber, String phoneNumber2, String faxNumber, String question,
			String response, String note, String collateral, String qualifiedDisqualified, String scannedBy) {
		super();
		this.eventName = eventName;
		this.scannedDate = scannedDate;
		this.scannedTime = scannedTime;
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.city = city;
		this.stateId = stateId;
		this.zip = zip;
		this.countryId = countryId;
		this.phoneNumber = phoneNumber;
		this.phoneNumber2 = phoneNumber2;
		this.faxNumber = faxNumber;
		this.question = question;
		this.response = response;
		this.note = note;
		this.collateral = collateral;
		this.qualifiedDisqualified = qualifiedDisqualified;
		this.scannedBy = scannedBy;
	}

}
