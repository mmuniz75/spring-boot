package edu.muniz.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository repository;
		
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		repository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id){
		return repository.findOne(id);
	}
	
	public void addTopic(Topic topic){
		repository.save(topic);
	}
	
	public void updateTopic(Topic topic,String id){
		repository.save(topic);
	}
	
	public void deleteTopic(String id){
		repository.delete(id);
	}
}
