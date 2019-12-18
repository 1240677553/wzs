package com.leimingputongfangfa;

import java.text.ParseException;

@FunctionalInterface
interface Printable{
	void print(StringUtils su,String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E27 {
	private static void printUpper(StringUtils su,String text,Printable pt){
				pt.print(su, text);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		printUpper(new StringUtils(), "Hello",(Object,t)->Object.printUpperCase(t));
		printUpper(new StringUtils(), "Hello",StringUtils::printUpperCase);
	}

}
