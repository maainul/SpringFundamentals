package com.mainul.spring.testspring.PatientTest;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
    	Patient patient = (Patient)context.getBean("patient");
    	patient.speak();
        //System.out.println( "Hello World!" );
    	((FileSystemXmlApplicationContext)context).close();
    }
}
