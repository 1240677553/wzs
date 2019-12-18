package rj;

public class Recursive {
	public static int getSum(int n) {
		if (n==1) {
			return 1;
		}
		int temp=getSum(n-1);
		return temp+n;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum=getSum(4);
		System.out.println("sum="+sum);
	}

}
