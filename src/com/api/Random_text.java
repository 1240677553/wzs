package com.api;
import java.util.Random;
public class Random_text {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random r=new Random();
		System.out.println("随机生成一个[0,1)之间的一个浮点数"+Math.random());
		System.out.println("随机生成一个[0,1)之间的一个浮点数"+r.nextDouble());
		System.out.println("随机生成-21亿到21亿之间的一个整数"+r.nextInt());
		System.out.println("随机生成10以内不包含10但包含0的一个整数"+r.nextInt(10));
	}

}
