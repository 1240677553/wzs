package com.thread;

public class Thread_test8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Thread thread1=new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+"正在输出i:"+i);
			}
		},"优先级较低的线程");
		Thread thread2=new Thread(()->{
			for(int j=0;j<10;j++) {
				System.out.println(Thread.currentThread().getName()+"正在输出j:"+j);
			}
		},"优先级较高的线程");
		Thread thread3=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				for(int i=0;i<10;i++) {
					System.out.println(Thread.currentThread().getName()+"正在输出i:"+i);
				}
			}
		},"优先级普通的线程");
		thread1.setPriority(1);
		thread2.setPriority(10);
		thread3.setPriority(10);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
