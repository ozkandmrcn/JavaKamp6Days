package dataAccess.concretes.sql;

import java.util.ArrayList;
import java.util.List;
import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;


public class SqlCourseDao implements CourseDao {

	List <Course> courses;
	
	public SqlCourseDao() {
		this.courses = new ArrayList<Course>();
	}
	
	@Override
	public List<Course> getAll() {
		return this.courses;
	}

	@Override
	public void add(Course entity) {
		courses.add(entity);
	}

	@Override
	public void update(Course entity) {
		
		int index = this.courses.indexOf(entity);
		Course course = this.courses.get(index);
		
		course.setCourseId(entity.getCourseId());
		course.setCategory(entity.getCategory());
		course.setDescription(entity.getDescription());
		course.setCourseName(entity.getCourseName());
		course.setImagePath(entity.getImagePath());
		course.setStepNumber(entity.getStepNumber());
		course.setTeacher(entity.getTeacher());
	}

	@Override
	public void delete(Course entity) {
		courses.remove(entity);
	}

	@Override
	public List <Course> getByCourseName(String courseName) {
		List <Course> matchedCourses = new ArrayList<Course>();
		for(Course course : this.courses) {
			if(course.getCourseName().contains(courseName)) {
				matchedCourses.add(course);
			}
		}
		return matchedCourses;
	}

	@Override
	public List <Course> getByTeacherName(String teacherName) {
		List <Course> matchedTeachers = new ArrayList<Course>();
		for(Course course : this.courses) {
			if(course.getTeacher().getFirstName() == teacherName) {
				matchedTeachers.add(course);
			}
		}
		return matchedTeachers;
	}
	
	

}
