package com.api;

public class E55 {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s=" http://lo calhost:8080 ";
		System.out.println("去除字符串两端空格后的结果："+s.trim());
		System.out.println("去除字符串中所有空格后的结果："+s.replace("",""));
		System.out.println("字符串去掉所有的空格以后是"+s.replaceAll("\\s+",""));
	}

}
