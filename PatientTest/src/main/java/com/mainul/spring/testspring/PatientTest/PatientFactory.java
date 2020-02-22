package com.mainul.spring.testspring.PatientTest;

public class PatientFactory {
	
	public Patient createPatient (int id, String nameString) {
		System.out.println("using factory class to create patient");
		return new Patient(id, nameString);
	}

}
