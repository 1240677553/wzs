package com.abstract_;
abstract class Animal{
	//定义抽象方法
	public abstract void shout();
}
class Dog extends Animal{
	//实现抽象方法
	public void shout() {
		System.out.println("汪汪.......");
	}
}
//定义测试类
public class E12 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
	}
}
