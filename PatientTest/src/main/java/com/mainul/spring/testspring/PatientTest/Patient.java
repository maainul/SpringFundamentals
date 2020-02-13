package com.mainul.spring.testspring.PatientTest;

public class Patient {
	
	private int id;
	private String nameString;
	private int nationalId;
	
	public Patient() {
		
	}

	
	
	public int getNationalId() {
		return nationalId;
	}



	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
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



	@Override
	public String toString() {
		return "Patient [id=" + id + ", nameString=" + nameString + ", nationalId=" + nationalId + "]";
	}



	public void speak() {
		System.out.println("Help me");
	}

}
