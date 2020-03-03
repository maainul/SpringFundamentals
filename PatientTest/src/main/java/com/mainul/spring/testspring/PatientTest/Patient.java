package com.mainul.spring.testspring.PatientTest;

import java.util.List;

public class Patient {

	private int id;
	private String nameString;

	private List<String> emergencyContactName;
	
	public List<String> getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(List<String> emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", nameString=" + nameString + "]";
	}

	public Patient() {

	}

	public void onCreate() {
		System.out.println("patient created :" + this);
	}

	public void onDestroy() {
		System.out.println("patient destroyed");
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
