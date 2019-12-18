package com.api;

public class Zfc_text {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String zfc=new String("HelloWorld");
		for(int i = zfc.length()-1;i >=0 ; i--) {
			if(zfc.charAt(i)>='a'&&zfc.charAt(i)<='z')
					System.out.print((char)(zfc.charAt(i)-32));
			else if(zfc.charAt(i)>='A'&&zfc.charAt(i)<='Z')
				System.out.print((char)(zfc.charAt(i)+32));
		}
	}

}
