package com.mainul.spring.testspring.PatientTest;

import java.util.List;

public class Patient {

	private int id;
	private String nameString;

	private List<String> emergencyContactNames;

	public Patient() {

	}

	public Patient(int id, String nameString) {
		this.id = id;
		this.nameString = nameString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getEmergencyContactNames() {
		return emergencyContactNames;
	}

	public void setEmergencyContactNames(List<String> emergencyContactNames) {
		this.emergencyContactNames = emergencyContactNames;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public void speak() {
		System.out.println("Help me");
	}

}
