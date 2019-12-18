package com.chapter4;
class Animal{

	public Animal(String name) {
		System.out.println("我是一只"+name);
	}
}
class Dog extends Animal_1{
	public Dog() {
		super("京哈巴");
	}
}
public class E01 {

	public static void main(String[] args) {
		Dog dog=new Dog();
	}

}
