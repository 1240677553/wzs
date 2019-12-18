package com.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Path path=Paths.get("D:\\test\\文件夹\\test.txt");
		System.out.println("path的根路径:"+path.getRoot());
		System.out.println("path的父路径:"+path.getParent());
		System.out.println("path中的路径名称数:"+path.getNameCount());
		for(int i=0;i<path.getNameCount();i++) {
			Path name=path.getName(i);
			System.out.println("索引为"+i+"的路径的名称为："+name);
		}
		System.out.println("path的URI的路径为:"+path.toUri());
		System.out.println("path的绝对路径:"+path.toAbsolutePath());
	}

}
