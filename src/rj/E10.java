package rj;

public class E10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] array = {9,8,3,5,2};
		for(int szys:array) {
			System.out.println(szys+"");
		}
		System.out.println();
		for (int m=1; m<array.length; m++) {
			for (int n=0;n<array.length-m;n++) {
				if(array[n]>array[n+1]) {
					int temp=array[n];
					array[n]=array[n+1];
					array[n+1]=temp;
				}
			}
			}
		for(int i=0;i<array.length; i++) {
			System.out.print(array[i]+"");
		}
	}	
}
