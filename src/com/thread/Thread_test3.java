package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Mythread3 implements Callable<Object>{
	public Object call() throws Exception{
	 int i=0;
	 while(i++<5) {
	 System.out.println(Thread.currentThread().getName()+"的call()方法正在运行");
	 }
	 return i;
}
}
public class Thread_test3 {

	public static void main(String[] args) throws InterruptedException,ExecutionException{
		Mythread3 mythread3=new Mythread3();
		FutureTask<Object> ft1=new FutureTask<>(mythread3);
		Thread thread1=new Thread(ft1,"thread1");
		thread1.start();
		FutureTask<Object>ft2=new FutureTask<>(mythread3);
		Thread thread2=new Thread(ft2,"thread2");
		thread2.start();
		System.out.println("thread1返回结果:"+ft1.get());
		System.out.println("thread2返回结果:"+ft2.get());

	}

}
