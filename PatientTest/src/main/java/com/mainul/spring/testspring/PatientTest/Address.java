package com.mainul.spring.testspring.PatientTest;

public class Address {

	private String streetString;
	private String postcodeString;
	
	public Address() {
		
	}
	public Address(String streetString, String postcodeString) {
		this.streetString = streetString;
		this.postcodeString = postcodeString;
	}

	public String getStreetString() {
		return streetString;
	}
	
	public void setStreetString(String streetString) {
		this.streetString = streetString;
	}
	
	public String getPostcodeString() {
		return postcodeString;
	}
	
	public void setPostcodeString(String postcodeString) {
		this.postcodeString = postcodeString;
	}
	
	
	@Override
	public String toString() {
		return "Address [streetString=" + streetString + ", postcodeString=" + postcodeString + "]";
	}
	
}
