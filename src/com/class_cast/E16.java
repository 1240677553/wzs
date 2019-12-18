package com.class_cast;
interface Animal{
	void shout();
}
class Tiger implements Animal{
	@Override
	public void shout() {
		System.out.println("aow");
	}
	public void eatMan() {
		System.out.println("老虎吃人了");
	}
}
class Pig implements Animal{
	@Override
	public void shout() {
		System.out.println("hengheng...");
	}
}
public class E16 {
	public static void main(String[] args) {
		Animal an1=new Pig();
		if (an1 instanceof Tiger) {
			Tiger tiger=(Tiger) an1;
			tiger.shout();
			tiger.eatMan();
		}else {
			System.out.println("这个动物不是老虎");
		}
		
		
		

	}

}
