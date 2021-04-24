package jersey.service;

import java.util.ArrayList;
import java.util.List;

import jersey.model.Course;


public class CourseService {
	
	public List<Course> getAllCourses() {
		Course c1 = new Course("mpr", "mobile programming");
		Course c2 = new Course("se2", "software programming 2");
		List<Course> list = new ArrayList<Course>();
		list.add(c1);
		list.add(c2);
		return list;
	}

}
