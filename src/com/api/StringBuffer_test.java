package com.api;

import org.omg.CORBA.PUBLIC_MEMBER;

public class StringBuffer_test{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s="我爱你中国";
		StringBuffer zfchc=new StringBuffer(s);
		System.out.println(zfchc);
		zfchc.append("!");
		System.out.println(zfchc);
		zfchc.insert(3,',');
		System.out.println(zfchc);
	}

}
