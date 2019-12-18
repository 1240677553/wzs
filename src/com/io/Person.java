package com.io;

import javax.management.loading.PrivateClassLoader;

public class Person {
private static final long serialVersionUID=2L;
private String name;
private int Age;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		Age = age;
	}
	public Person() {
		super();
		// TODO 自动生成的构造函数存根
	}

}
