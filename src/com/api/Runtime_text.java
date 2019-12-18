package com.api;

import java.io.IOException;
public class Runtime_text {

	public static void main(String[] args) throws IOException,InterruptedException{
		Runtime rt=Runtime.getRuntime();
		System.out.println("本机处理器的个数是"+rt.availableProcessors()+"个");
		System.out.println("空闲内存大小时"+rt.freeMemory()/1024/1024+"MBytes");
		System.out.println("最大内存大小是"+rt.maxMemory()/1024/1024+"MBytes");
	
		Process jincheng=rt.exec("notepad");
		Thread.sleep(3000);
		jincheng.destroy();
	}

}
