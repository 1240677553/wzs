package jhart;

import java.util.concurrent.ConcurrentSkipListSet;

public class Student_text {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student s1=new Student();
		s1.setName("chengjian");
		s1.setScore(500);
		Student s2=new Student("zangzang",590);
		System.out.println(s1.getName()+"考了"+s1.getScore()+"分");
		System.out.println(s2.getName()+"考了"+s2.getScore()+"分");
		
		Course c1=new Course();
		c1.setCourse_name("Java程序设计");
		c1.setCourse_book("Java基础入门");
		System.out.println(c1.getCourse_name()+"这门课程使用的教材是《"+c1.getCourse_book()+"》");
		
	}
}
