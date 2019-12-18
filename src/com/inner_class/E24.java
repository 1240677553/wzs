package com.inner_class;

import javax.print.attribute.PrintJobAttributeSet;

@FunctionalInterface
interface Calcable{
	int calc(int num);
}
class Math{
	public static int abs(int num) {
		if (num>=0) {
			return num;
		}else {
			return-num;
		}
	}
}
public class E24 {
	public static void main(String[] args) {
		PrintAbs(-50,n->Math.abs(n));
		PrintAbs(-40,Math::abs);
	}

	private static void PrintAbs(int i, Calcable c) {
		// TODO 自动生成的方法存根
		System.out.println(c.calc(i));
	}

}
