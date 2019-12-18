package com.jihe;
import java.util.TreeSet;
class Teacher implements Comparable{
	String name;
	int age;
	public Teacher(String name,int age) {
	this.name=name;
	this.age=age;
}
public String toString() {
	return name+":"+age;
}
public int compareTo(Object obj) {
	Teacher s=(Teacher) obj;
	if (this.age-s.age>0) {
		return-1;
	}
	if (this.age-s.age==0) {
		return this.name.compareTo(s.name);
	}
	return-1;
	}
}
public  class TreeSet_text2 {

	public static void main (String[] args) {
		// TODO 自动生成的方法存根
		TreeSet ts=new TreeSet();
		ts.add(new Teacher("jack",19));
		ts.add(new Teacher("Rose",29));
		ts.add(new Teacher("Tom",19));
		ts.add(new Teacher("james",19));
		System.out.println(ts);
	}
}
