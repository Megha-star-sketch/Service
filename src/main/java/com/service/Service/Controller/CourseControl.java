package com.service.Service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.Service.Model.Course;
import com.service.Service.Service.CourseService;

@RestController
@RequestMapping("/Course")
public class CourseControl {
	
	@Autowired
	private CourseService service;

	@PostMapping("/addCourse")
	public Course Register(@RequestBody Course course)
	{
		return service.AddCourse(course);
	}
	
	@GetMapping("/getAll")
	public List<Course> GetAllCourse()
	{
		return service.GetAll();
	}
	
//	@GetMapping("/get/{c_id}")
//	public int getCourse(@PathVariable int c_id) {
//		
//		return service.getCourseName(c_id);
//	}
	
	@PutMapping("/update/{course}")
	public Course UpdateCourse(@RequestBody Course course)
	{
		return service.Update(course);
	}
	
	@DeleteMapping("/delete/{c_id}")
	public void DeleteCourse(@PathVariable int c_id)
	{
		service.DeleteById(c_id);
	}
	
	
}
