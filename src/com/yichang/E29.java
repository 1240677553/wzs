package com.yichang;

public class E29 {
	public static int divide(int x,int y) {
		try {
			int result=x/y;
			return result;
		}catch (Exception e) {
			System.out.println("捕捉到得异常信息为:"+e.getMessage());
		}finally {
			System.out.println("执行finally代码块，无论程序是否异常，都会执行");
		}
		return-1;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int result=divide(4, 0);
		if (result==-1) {
			System.out.println("程序发生异常!");
		}else {
			System.out.println(result);
		}
	}

}
