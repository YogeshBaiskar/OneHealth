package com.onehealth.patientmanagement.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PatientProfile {

	// Primary key for the patient profile
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long patientId;

	// User ID associated with the patient
	private long userId;

	// First name of the patient
	private String firstName;

	// Last name of the patient
	private String lastName;

	// Mobile number of the patient
	private String mobileNumber;

	// Address of the patient
	private String address;

	// Pin code of the patient's address
	private int pinCode;

	// Country of the patient
	private String country;

	// City of the patient
	private String city;

	// Gender of the patient
	private String gender;

	// Age of the patient
	private int age;

	// Date of birth of the patient
	private Date dob;

	// Blood group of the patient
	private String bloodGroup;

	// Height of the patient
	private float height;

	// Weight of the patient
	private float weight;

	// Marital status of the patient
	private String maritalStatus;

	// Email ID of the patient
	private String emailId;

	// Default constructor for the PatientProfile class
	public PatientProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Parameterized constructor for the PatientProfile class
	public PatientProfile(long patientId, long userId, String mobileNumber, String address, int pinCode, String country,
			String city, String gender, int age, Date dob, String bloodGroup, float height, float weight,
			String maritalStatus, String emailId) {
		super();
		this.patientId = patientId;
		this.userId = userId;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.pinCode = pinCode;
		this.country = country;
		this.city = city;
		this.gender = gender;
		this.age = age;
		this.dob = dob;
		this.bloodGroup = bloodGroup;
		this.height = height;
		this.weight = weight;
		this.maritalStatus = maritalStatus;
		this.emailId = emailId;
	}

	// Getter method for patientId
	public long getPatientId() {
		return patientId;
	}

	// Setter method for patientId
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	// Getter method for userId
	public long getUserId() {
		return userId;
	}

	// Setter method for userId
	public void setUserId(long userId) {
		this.userId = userId;
	}

	// Getter method for mobileNumber
	public String getMobileNumber() {
		return mobileNumber;
	}

	// Setter method for mobileNumber
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	// Getter method for address
	public String getAddress() {
		return address;
	}

	// Setter method for address
	public void setAddress(String address) {
		this.address = address;
	}

	// Getter method for pinCode
	public int getPinCode() {
		return pinCode;
	}

	// Setter method for pinCode
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	// Getter method for country
	public String getCountry() {
		return country;
	}

	// Setter method for country
	public void setCountry(String country) {
		this.country = country;
	}

	// Getter method for city
	public String getCity() {
		return city;
	}

	// Setter method for city
	public void setCity(String city) {
		this.city = city;
	}

	// Getter method for gender
	public String getGender() {
		return gender;
	}

	// Setter method for gender
	public void setGender(String gender) {
		this.gender = gender;
	}

	// Getter method for age
	public int getAge() {
		return age;
	}

	// Setter method for age
	public void setAge(int age) {
		this.age = age;
	}

	// Getter method for dob
	public Date getDob() {
		return dob;
	}

	// Setter method for dob
	public void setDob(Date dob) {
		this.dob = dob;
	}

	// Getter method for bloodGroup
	public String getBloodGroup() {
		return bloodGroup;
	}

	// Setter method for bloodGroup
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	// Getter method for height
	public float getHeight() {
		return height;
	}

	// Setter method for height
	public void setHeight(float height) {
		this.height = height;
	}

	// Getter method for weight
	public float getWeight() {
		return weight;
	}

	// Setter method for weight
	public void setWeight(float weight) {
		this.weight = weight;
	}

	// Getter method for maritalStatus
	public String getMaritalStatus() {
		return maritalStatus;
	}

	// Setter method for maritalStatus
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	// Getter method for emailId
	public String getEmailId() {
		return emailId;
	}

	// Setter method for emailId
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	// Overriding the toString method to provide a meaningful representation of the object
	@Override
	public String toString() {
		return "PatientProfile [patientId=" + patientId + ", userId=" + userId + ", mobileNumber=" + mobileNumber
				+ ", address=" + address + ", pinCode=" + pinCode + ", country=" + country + ", city=" + city
				+ ", gender=" + gender + ", age=" + age + ", dob=" + dob + ", bloodGroup=" + bloodGroup + ", height="
				+ height + ", weight=" + weight + ", maritalStatus=" + maritalStatus + ", emailId=" + emailId + "]";
	}
}
