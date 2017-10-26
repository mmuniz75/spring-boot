package edu.muniz.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicServiceLocal {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1","Spring","Spring discussion"),
			 new Topic("2","AngularJS","AngularJS discussion"),
			 new Topic("3","Docker","Docker discussion"),
			 new Topic("4","Jenkins","Jekins discussion"),
			 new Topic("5","AWS","AWS discussion")
			 ));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic){
		topics.add(topic);
	}
	
	public void updateTopic(Topic topic,String id){
		for(int i=0;i<topics.size();i++){
			if(topics.get(i).getId().equals(id)){
				topics.set(i, topic);
			}
		}
	}
	
	public void deleteTopic(String id){
		topics.removeIf(topic -> topic.getId().equals(id));
	}
}
