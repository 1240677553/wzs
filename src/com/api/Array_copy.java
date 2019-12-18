package com.api;

public class Array_copy {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[]= {6,5,4,2,3,1};
		int b[]= {6,25,534,312,43};
		System.arraycopy(a,2,b,0,4);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
