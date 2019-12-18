package com.jihe;
import java.util.*;
class Student{
	String id;
	String name;
	public Student(String id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+":"+name;
	}
}
public class E610 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSet<Student> hs =new HashSet<Student>();
		Student stu1=new Student("1","Jack");
		Student stu2=new Student("2","Rose");
		Student stu3=new Student("3","Rose");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);
		
	}

}
