package com.jihe;

public class PersonModel {
		String name;
		int age;
		String sex;
		public PersonModel(String name, int age, String sex) {
			super();
			this.name = name;
			this.age = age;
			this.sex = sex;
		}
		public PersonModel() {
			super();
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}

