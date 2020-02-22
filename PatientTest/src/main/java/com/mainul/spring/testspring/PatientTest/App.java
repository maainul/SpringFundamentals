package com.mainul.spring.testspring.PatientTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/mainul/spring/testspring/PatientTest/beans/beans.xml");
    	
    	
    	Patient patient = (Patient)context.getBean("patient");
    	
    	
    	Address address2 = (Address)context.getBean("address2");
    	
    	System.out.println(patient);
    	System.out.println(address2);
    	
    	
    	((ClassPathXmlApplicationContext)context).close();
    }
}
