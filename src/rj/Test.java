package rj;

import java.time.format.TextStyle;

public class Test {

	public Test() {
		System.out.println("构造方法一被调用了");
	}
	public Test(int x) {
		this();
		System.out.println("构造方法二被调用了");
	}
	public Test(boolean b) {
		this(1);
		System.out.println("构造方法三被调用了");
	}
	public void openMounth() {};
	public void speak() {this.openMounth();};
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Test  test=new Test(true);
	}

}
