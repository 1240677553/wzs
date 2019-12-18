package com.api;

public class E54 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s1="我abc爱1a3b中6cc3国b7a65d32wd645dw.jpg";
		System.out.println("\n这个字符里的数字是：");
		char[] zfsz=s1.toCharArray();
		for(char zf:zfsz) {
			if (zf>='0'&&zf<='9') {
				System.out.print(zf);
			}
		}
		System.out.println("\n这个字符里的字母是：");
		char[] zfse=s1.toCharArray();
		for(char ze:zfse) {
			if (ze>='a'&&ze<='z') {
				System.out.print(ze);
			}
		}
		System.out.println("\n这个字符里的汉字是：");
		char[] zfsh=s1.toCharArray();
		for(char zh:zfsh) {
			if (zh>='\u4E00'&&zh<='\u9FA5') {
				System.out.print(zh);
			}
		}
	}

}
