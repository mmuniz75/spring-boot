package edu.muniz.springboot.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;
		
	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		repository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id){
		return repository.findOne(id);
	}
	
	public void addCourse(Course Course){
		repository.save(Course);
	}
	
	public void updateCourse(Course Course,String id){
		repository.save(Course);
	}
	
	public void deleteTopic(String id){
		repository.delete(id);
	}
}
