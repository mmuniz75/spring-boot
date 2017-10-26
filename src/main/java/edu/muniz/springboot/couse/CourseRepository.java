package edu.muniz.springboot.couse;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	List<Course> findByTopicId(String topicId);

}