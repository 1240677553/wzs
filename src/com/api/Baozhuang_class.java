package com.api;

public class Baozhuang_class {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=20;
		Integer b=a;
		int c=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		String chengji="88";
		System.out.println("No.1:包装类的valueOf方法--->"+(Integer.valueOf(chengji)+10));
		System.out.println("No.2:包装类的parseXXX方法--->"+(Integer.parseInt(chengji)+10));
		System.out.println("No.3:包装类的构造方法--->"+(Integer.parseInt(chengji)+10));
		int zs=88;
		System.out.println(chengji);
		System.out.println("No.1:包装类的valueOf方法--->"+String.valueOf(zs));
		System.out.println("No.2:包装类的parseXXX方法--->"+chengji.toString());
		System.out.println("No.3:包装类的构造方法--->"+chengji+"");	
	}

}
