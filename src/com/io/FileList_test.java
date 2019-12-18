package com.io;

import java.io.File;
import java.io.FileDescriptor;
import java.util.Arrays;
public class FileList_test {

	public static void main(String[] args) {
		File file=new File("E:\\java基础");
		FileDir(file);
		}

	private static void FileDir(File file) {
		// TODO 自动生成的方法存根
		File[] listFiles=file.listFiles();
		for(File files:listFiles) {
			if (files.isDirectory()) {
				FileDir(files);
			}else if (files.isFile()) {
				if (files.getName().endsWith(".java")) {
					System.out.println(files);
				}
			}
	}
	}
}
