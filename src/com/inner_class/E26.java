package com.inner_class;
@FunctionalInterface
interface PersonBuilder{
	Person buildPerson(String name);
}
class Person{
	private String name;
	public Person (String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
}
public class E26 {
	public static void printName(String name,PersonBuilder builder) {
		System.out.println(builder.buildPerson(name).getname());
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		printName("刘德华", name->new Person(name));
		printName("臧天业", Person::new);
	}

}
