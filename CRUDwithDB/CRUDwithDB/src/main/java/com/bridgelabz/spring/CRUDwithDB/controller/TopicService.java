package com.bridgelabz.spring.CRUDwithDB.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/*in Spring Business Serivces are mainly Singleton .
*Spring creates the instance of this service and kepps it throughout the apllication 
*so tha Controllers n all can use that instance.*/

@Service // it tells the Spring that this is the Service class.
public class TopicService 
{
	
	
	/* Step 3 --> Get the TopicRepository instance in the TopicService so that we can make calls 
	 * to the TopicRepository from the service.
	 * Best way to get an instance in the Spring is by autowiring it*/
	@Autowired
	private TopicRepository topicRepository;
	
	
	
	//remove the hard coded list as DB can handle on itz own.
	/*
	//initialization.
	public List<Topic> topics = new ArrayList<>(	Arrays.asList(
			new Topic("Spring ", "Spring ID"," Spring Description"),
			new Topic("java ", "java ID"," java Description"),
			new Topic("BootStrap ", "BootStrap ID"," BootStrap Description")
	
				));
	
	*/
	
	
	
	//method to acess the list of topics.
	public List<Topic> getAllTopics()
	{
		//return topics;
		
		//retreiving data from the database.
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics:: add);
		
		return topics;
	}
	
	//method to acess asingle variable from the topic class
	public Topic getTopic(String id)
	{
		
	/*stream is a sequence of objects that supports various methods which can
	 *  be pipelined to produce the desired result. ... 
	 *  Terminal operations mark the end of the stream and return the result.
	 *  In computer science, a stream is a sequence of data elements made available over time.*/
		
	//	return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		 
		//making call to the DB and returning the value we want.
		return topicRepository.findById(id).orElse(null); //findById is replaced by findOne() method of CrudRepository.
		//findById Returns: the entity with the given id or Optional#empty() if none found.
		
	}

	public void addtopic(Topic topic)
	{
		//topics.add(topic);
		 //thats all we have to do to save the topic to the database.
		topicRepository.save(topic);
		
	}

	public void updatetopic(String id, Topic topic) 
	{
		/*
		 for(int i=0; i<topics.size(); i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
		}
		*/
		//save the updated topic in the database.
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String ID)
	{
		//topics.removeIf(t -> t.getId().equals(ID));
		
		//delete request made to the DB
		topicRepository.deleteById(ID); //deleteById is replaced by delete(id)
	}

	
}
