package jhart;

public class Course {
	String Course_id;
	String Course_name;
	String Course_book;
	
	public Course(String course_name, String course_book) {
		super();
		this.Course_name = course_name;
		this.Course_book = course_book;
	}
	public Course() {}
	public String getCourse_id() {
		return Course_id;
	}
	public void setCourse_id(String course_id) {
		this.Course_id = course_id;
	}
	public String getCourse_name() {
		return Course_name;
	}
	public void setCourse_name(String course_name) {
		this.Course_name = course_name;
	}
	public String getCourse_book() {
		return Course_book;
	}
	public void setCourse_book(String course_book) {
		this.Course_book = course_book;
	}
}
