package com.inner_class;
@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E25 {
	private static void printUpper(String text,Printable pt) {
		pt.print(text);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		StringUtils stu=new StringUtils();
		printUpper("Hello", t->stu.printUpperCase(t));
		printUpper("World", stu::printUpperCase);
	}

}
