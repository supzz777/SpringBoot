package com.bridgelabz.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication //this annotation tells the spring that this class is the starting point of our application.
public class CourseApiApp 
{
    public static void main( String[] args )
    {
    	System.out.println("Main Program..");
    	//our application gets started by this run function.
       SpringApplication.run(CourseApiApp.class, args);
       
    }
    
    
}
