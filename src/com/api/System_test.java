package com.api;
import java.util.*;
public class System_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Properties shuxing=System.getProperties();
		Set<String> shuxingming=shuxing.stringPropertyNames();
		for(String key : shuxingming ) {
			String value=System.getProperty(key);
			System.out.println(key+"---->"+value);
		}
	}

}
