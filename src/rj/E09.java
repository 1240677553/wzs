package rj;

public class E09 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum=0;
		for (int i=1; i<100; i+=2) { 
			sum=sum+i;
		}
		
		System.out.println("一百以内的奇数的和是"+sum);
		
		sum=0;
		int i=2;
		while(i<=100) {
			sum=sum+i;
			i+=2;
		}
		System.out.println("一百以内的偶数和是"+sum);
	}

}
