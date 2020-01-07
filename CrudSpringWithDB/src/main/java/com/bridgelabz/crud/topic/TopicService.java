package com.bridgelabz.crud.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/*in Spring Business Serivces are mainly Singleton .
*Spring creates the instance of this service and kepps it throughout the apllication 
*so tha Controllers n all can use that instance.*/

@Service // it tells the Spring that this is the Service class.
public class TopicService 
{
	
	//initialization.
	public List<Topic> topics = new ArrayList<>(	Arrays.asList(
			new Topic("Spring ", "Spring ID"," Spring Description"),
			new Topic("java ", "java ID"," java Description"),
			new Topic("BootStrap ", "BootStrap ID"," BootStrap Description")
	
				));
	
	
	
	
	
	//method to acess the list of topics.
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	//method to acess asingle variable from the topic class
	public Topic getTopic(String id)
	{
		
	/*stream is a sequence of objects that supports various methods which can
	 *  be pipelined to produce the desired result. ... 
	 *  Terminal operations mark the end of the stream and return the result.
	 *  In computer science, a stream is a sequence of data elements made available over time.*/
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addtopic(Topic topic)
	{
		topics.add(topic);
		
	}

	public void updatetopic(String id, Topic topic) 
	{
		for(int i=0; i<topics.size(); i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String ID)
	{
		topics.removeIf(t -> t.getId().equals(ID));
	}

	
}
