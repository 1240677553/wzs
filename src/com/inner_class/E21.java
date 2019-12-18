package com.inner_class;
@FunctionalInterface
interface Animal{
	void shout();
}
@FunctionalInterface
interface Calculate{
	int sum(int a,int b);
}
class Cat implements Animal{
	@Override
	public void shout() {
		System.out.println("喵喵");
	}
}
public class E21 {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Cat cat=new Cat();
		cat.shout();
		animalShout(new Animal() {
			@Override
			public void shout() {
				System.out.println("wangwang");
			}
		});
		animalShout(()->System.out.println("aow"));
		showSum(10,50,(a,b)->a+b);
	}
	private static void showSum(int a, int b, Calculate c) {
		System.out.println(a+"+"+b+"的和是"+c.sum(a, b));
	}
	public static void animalShout(Animal an) {
		an.shout();
		
	}
}
