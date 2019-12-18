package com.jihe;
import java.util.*;
import java.util.stream.*;
public class Juhe {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<String>list=new ArrayList<>();
		list.add("张三");
		list.add("王五");
		list.add("陈四");
		list.add("李二");
		list.add("张二");
		list.add("张狂                                                                              ");
		Stream<String> liu=list.stream();
		liu.forEach(j->System.out.println(j));
		
		Stream<String> liu2=list.stream();
		Stream<String> liu3=liu2.filter(k->k.startsWith("张"));
		System.out.println("集合里所有姓张的人:");
		liu3.forEach(j->System.out.println(j));
		
		System.out.println("集合里的人:");
		System.out.println(list.stream().filter(k->k.startsWith("张")).collect(Collectors.joining(",")));
		
		Stream<String>stream=Stream.of("张三","王五","陈四","李二");
		stream.skip(1)
			.limit(2)
			.forEach(System.out::println);
	}

}
