package com.bridgelabz.spring.CRUDwithDB.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

/*Step 1--> we need to save topic instance inside the relational database table.
 * So we need to tell the JPA about this class to save.
 * So mark this class as Entity with @Entity annotation.*/

@Entity
public class Topic 
{
	//in a relational DB every table should have a primary key so marking id coloumn as primary key.
	private String name;
	
	@Id //makes the id coloumn primary key in the relational DB.
	private String id;
	private String description;
	
	
	public Topic() 
	{
	
	}
	
	
	
	//cpmstructors using the feilds.
	public Topic(String name, String id, String description) 
	{
		
		super();
		this.name = name;
		this.id = id;
		this.description = description;
	}
	
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	

}
