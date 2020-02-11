# SpringFundamentals

## Create a New Project (Hello World)

## Add Dependencies (3.2.11)

```
<!-- spring-core which provides core functionality -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-core</artifactId>
			<version>3.2.11.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>3.2.11.RELEASE</version>
		</dependency>
 		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-beans</artifactId>
			<version>3.2.11.RELEASE</version>
		</dependency>
 
		<!-- The spring-aop module provides an AOP Alliance-compliant aspect-oriented 
			programming implementation allowing you to define -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-aop</artifactId>
			<version>3.2.11.RELEASE</version>
		</dependency>
 
		<!-- The spring-webmvc module (also known as the Web-Servlet module) contains 
			Spring’s model-view-controller (MVC) and REST Web Services implementation 
			for web applications -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>3.2.11.RELEASE</version>
		</dependency>
 
		<!-- The spring-web module provides basic web-oriented integration features 
			such as multipart file upload functionality and the initialization of the 
			IoC container using Servlet listeners and a web-oriented application context -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-web</artifactId>
			<version>3.2.11.RELEASE</version>
		</dependency>

```
# Add A Class

```
public class Patient {
	public void speak() {
		System.out.println("Help me");
	}

}
```
