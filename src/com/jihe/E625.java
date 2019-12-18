package com.jihe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class E625 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<String>list=new ArrayList<>();
		Collections.addAll(list,"c","z","b","k");
		System.out.println("排序前:"+list);
		Collections.reverse(list);
		System.out.println("反转后:"+list);
		Collections.sort(list);
		System.out.println("按自然顺序排序后:"+list);
		Collections.shuffle(list);
		System.out.println("按随机顺序排序后:"+list);
		Collections.swap(list, 0, list.size()-1);
		System.out.println("集合首尾元素交换后:"+list);
		
		ArrayList<Integer> list2=new ArrayList<>();
		Collections.addAll(list2, -3,9,2,8,5);
		System.out.println("集合中的元素"+list2);
		System.out.println("集合中的最大值元素"+Collections.max(list2));
		System.out.println("集合中的最小值元素"+Collections.min(list2));
		Collections.replaceAll(list2,8,0);
		System.out.println("替换后集合中的元素"+list2);
		Collections.sort(list2);
		System.out.println("自然排序后："+list2);
		System.out.println("自然排序后,通过二分查找元素9的下标时："+Collections.binarySearch(list, "9"));
	}

}
