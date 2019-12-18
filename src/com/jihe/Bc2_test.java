package com.jihe;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
class CustomComparator implements Comparator<Object>{

	@Override
	public int compare(Object obj1, Object obj2) {
	String key1=(String)obj1;
	String key2=(String)obj2;
	return key2.compareTo(key1);
	}
	
}
public class Bc2_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map<String, String> tmap=new TreeMap<String, String>(new CustomComparator());
		tmap.put("2", "Jack");
		tmap.put("1", "Rose");
		tmap.put("3", "Lucy");
		tmap.put("5", "Lucy");
		tmap.put("4", "Tom");
		System.out.println("用键值对双集遍双列集合的键和值");	
		Set<String> jianji=tmap.keySet();
		Iterator<String> diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key=(Object) diedai.next();
			Object value=tmap.get(key);
			System.out.println(key+":"+value);
	}
		}
	}
