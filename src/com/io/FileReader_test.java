package com.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class FileReader_test {

	public static void main(String[] args) throws Exception{
		// TODO 自动生成的方法存根
		FileReader fr=new FileReader("d:\\test.txt");
		FileWriter fw=new FileWriter("poem1.txt");
		
		char []buff=new char[2048];
		int b=fr.read(buff);
		int b1=fr.read();
		while(b1!=-1) {
			System.out.print((char)b1);
			b1=fr.read();
		}
		fr.close();
		fw.close();
	}

}
