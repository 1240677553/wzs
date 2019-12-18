package com.jihe;
import java.util.HashSet;
public class Set_text {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSet<String> set=new HashSet();
		set.add("Jack");
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");
		set.forEach(o->System.out.println(o));
	}

}
