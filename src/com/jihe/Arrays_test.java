package com.jihe;
import java.security.Principal;
import java.util.Arrays; 
public class Arrays_test {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[]arr= {9,8,3,5,2};
		System.out.print("排序前:");
		PrintArray(arr);
		Arrays.sort(arr);
		System.out.print("排序后:");
		PrintArray(arr);
		
		Arrays.sort(arr);
		int index=Arrays.binarySearch(arr, 3);
		System.out.println("元素3的索引是:"+index);
		//拷贝数组元素
		int[] copiedArr=Arrays.copyOfRange(arr, 2, 8);
		System.out.println("\n被拷贝的数组是:");
		PrintArray(copiedArr);
		//替换数组元素
		Arrays.fill(copiedArr, 8);
		System.out.println("\n被拷贝的数组元素替换8以后是:");
		PrintArray(copiedArr);
	}

	private static void PrintArray(int[] arr) {
		// TODO 自动生成的方法存根
		System.out.println("[");
		for(int x=0;x<arr.length;x++) {
			if(x!=arr.length-1) {
				System.out.print(arr[x]+",");
			}else {
				System.out.println(arr[x]+"]");
			}
		}
	}

}
