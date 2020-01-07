package com.bridgelabz.crud.topic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController 
{
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topic")
	public String getTopic()
	{
		return "All Topics";
	}
	
	
	//metgod to get all the data from  the topic class.
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicService.getAllTopics();
	}
	
	
	//method to get a single variable i.e Topic ID from the Topic Class.
	@RequestMapping("/topics/{id}") // {} --> indicates that the id written inside is a variable portion (OR) @RequestMapping("/topics/Spring"), @RequestMapping("/topics/BootStrap")
	public Topic getTopic( @PathVariable ("id") String id) /*@PathVariable indicates that the {id} is same as  int ID  */
	{
		return topicService.getTopic(id);
		
	}
	
	/*get method is the default .Now lets see the Post method.
	   In post request new object is created*/
	@RequestMapping(method = RequestMethod.POST , value ="/topics")
	//@RequestBody takes the Topic body and convert it to the topic instance and passes to addtopic method.
	public void addtopic(@RequestBody  Topic topic)
	{
		
		topicService.addtopic(topic);
		
		
	}
		
	
	//update /put methods.
	@RequestMapping(method = RequestMethod.PUT , value ="/topics/{idz}")
	public void updatetopic(@RequestBody  Topic topic , @PathVariable ("idz") String id)
	{
		
		topicService.updatetopic(id,topic);
		
		
	}
	
	
	//delete method.
	@RequestMapping(method = RequestMethod.DELETE , value ="/topics/{idz}") // {} --> indicates that the id written inside is a variable portion (OR) @RequestMapping("/topics/Spring"), @RequestMapping("/topics/BootStrap")
	public void deleteTopic( @PathVariable ("idz") String id) /*@PathVariable indicates that the {id} is same as  int ID  */
	{
		 topicService.deleteTopic(id);
		
	}
	

}
