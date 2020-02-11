package com.mainul.spring.testspring.PatientTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/mainul/spring/testspring/PatientTest/beans/beans.xml");
    	Patient patient = (Patient)context.getBean("patient");
    	patient.speak();
        //System.out.println( "Hello World!" );
    	((ClassPathXmlApplicationContext)context).close();
    }
}
