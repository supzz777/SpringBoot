package com.bridgelabz.spring.CRUDwithDB.controller;

import org.springframework.data.repository.CrudRepository;


/* we dont have to implement the datalayer wejust have to use the
 *  CrudRepository thta comes with Spring Data JPA dependency. */	

public interface TopicRepository extends CrudRepository<Topic , String>
	/*CrudRepository<Topic , String>  -->  It takes the generic argument of
	 *<entity class, data type of primary key coloumn i.e -->String id over here.>*/
{
	//Step 2 -->  CRUD methods will be written here.
	
	/* We will be having these methods inside this class --->
	 * 1) getAllTopics()
	 * 2) getTopic(String id)
	 * 3) updateTpic(Topic t)
	 * 4) deleteTopic(String id)
	 * */
	
	
	

}
