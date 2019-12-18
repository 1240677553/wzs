package com.jihe;
import java.util.Comparator;
import java.util.TreeSet;
//定义比较器实现Comparator接口
class t3 implements Comparator{
	public int compare(Object obj1,Object obj2){
		String s1=(String)obj1;
		String s2=(String)obj2;
		int temp=s1.length()-s2.length();
		return temp;
	}
	
}
public class TreeSet_text3 {

	public static void main(String[] args) {
		//1.创建集合时，传入Comparator接口实现定制排序规则
		TreeSet ts=new TreeSet(new t3());
		ts.add("Jake");
		ts.add("makes");
		ts.add("hhh");
		ts.add("Jake");
		ts.add("colors");
		System.out.println(ts);
		//2.创建集合时，使用Lambda表达式定制排序规则
		TreeSet ts2=new TreeSet((obj1,obj2)->{
			String s1=(String)obj1;
			String s2=(String)obj2;
			return s1.length()-s2.length();
		});
		ts2.add("Jakes");
		ts2.add("make");
		ts2.add("hhh");
		ts2.add("Jakes");
		ts2.add("yellow");
		System.out.println(ts2);
	}

}
