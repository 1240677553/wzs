package rj;
/*
 *紫色的代码是关键字
 *褐色的代码是参数式局部变量
 *蓝色的代码是成员变量，他的地位比局部变量高，地位同成员方法一样
 *黑色的代码是标识符
 */ 
public class zhengshuleixing {

	public static void main(String[] args) {
		byte b=1;
		short s=1;
		int i=1;
		long l=1;
		
		float f=1.0f;
		
		double d=1.0;
		
		char c='a';
		char ci=97;
		short cc=97;
		System.out.println(c);
		System.out.println(ci);
		System.out.println((char)cc);
		
		boolean flag1=false;
		boolean flag2=true;
		System.out.println("字符型整数数据的长度是"+Character.SIZE);
		System.out.println("字符型数据的范围是"+(int)Character.MIN_VALUE+"-"+(int)Character.MAX_VALUE);
		System.out.println("字节型整数数据的长度是"+Byte.SIZE);
		System.out.println("短整型整数数据的长度是"+Short.SIZE);
		System.out.println("整型整数数据的长度是"+Integer.SIZE);
		System.out.println("长整型整数数据的长度是"+Long.SIZE);
		System.out.println("单精度型数据的长度是"+Float.SIZE);
		System.out.println("多精度型数据的长度是"+Double.SIZE);
		System.out.println("字节型整数数据的长度是"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
		System.out.println("短整型整数数据的长度是"+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
		System.out.println("整型整数数据的长度是"+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
		System.out.println("长整型整数数据的长度是"+Long.MIN_VALUE+"-"+Long.MAX_VALUE);
		System.out.println("单精度数据的长度是"+Float.MIN_VALUE+"-"+Float.MAX_VALUE);
		System.out.println("多精度数据的长度是"+Double.MIN_VALUE+"-"+Double.MAX_VALUE);
		System.out.println("布尔型数据的长度是"+Boolean.TRUE+"-"+Boolean.FALSE);
	}

}
