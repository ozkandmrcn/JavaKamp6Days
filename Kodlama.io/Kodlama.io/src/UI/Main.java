package UI;

import business.concretes.CourseManager;
import dataAccess.concretes.sql.SqlCourseDao;
import entities.concretes.Category;
import entities.concretes.Course;
import entities.concretes.Teacher;

public class Main {

	public static void main(String[] args) {
		
		
		
		Teacher teacher1=new Teacher(1, "Engin", "Demiroğ", "123456789", "engin@gmail.com", "1,jpg");
		Teacher teacher2=new Teacher(2, "Özkan", "Demircan", "123456789", "engin@gmail.com", "1,jpg");
		
		
		Category category1 = new Category(1, "Algorithm");
		Category category2 = new Category(2, "DataBase");
		
		Course course1 = new Course(1, category1, "Java", "Java BootCamp", "mr.img", teacher1, 10);
		Course course2 = new Course(2, category2,  "C#", "C# BootCamp", "mr.img", teacher2, 10);
		Course course3 = new Course(3, category1, "JavaScript", "JavaScript BootCamp", "mr.img", teacher2, 10);
		Course course4 = new Course(4, category1,  "Kotlin", "Kotlin BootCamp", "mr.img", teacher1, 10);
		
		CourseManager courseManager = new CourseManager(new SqlCourseDao());
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		
		for (Course course : courseManager.search("Java")) {
			System.out.println(course.getCourseName());
		}
		
	}

}
