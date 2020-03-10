package com.mainul.spring.testspring.PatientTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mainul/spring/testspring/PatientTest/beans/beans.xml");

		Patient patient = (Patient) context.getBean("patient");

		System.out.println(patient);

		for (String name : patient.getEmergencyContactNames()) {
			System.out.println(name);
		}

		((ClassPathXmlApplicationContext) context).close();
	}
}
