package edu.muniz.springboot.couse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
    private CourseService service;
	
	@RequestMapping("/courses/{topicId}")
	public List<Course> getAllCourses(@PathVariable String topicId) {
		return service.getAllCourses(topicId);
		
	}
	
	@RequestMapping("/course/{id}")
	public Course getCourse(@PathVariable String id){
		return service.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/course")
	public void addCourse(@RequestBody Course course){
		service.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/course/{id}")
	public void deleteTopic(@PathVariable String id){
		service.deleteTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/course/{id}")
	public void updateCourse(@RequestBody Course course,@PathVariable String id){
		service.updateCourse(course, id);
	}
	
}
