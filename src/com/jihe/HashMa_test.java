package com.jihe;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class HashMa_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map<String, String> map=new HashMap<String, String>();
		map.put("1", "Jack");
		map.put("2", "Rose");
		map.put("3", "Lucy");
		map.put("4", "Lucy");
		map.put("1", "Tom");
		System.out.println(map);
		
		if (map.containsKey("1")) {
			System.out.println("这个双列集合包含键1");
		System.out.println("这个双列集合键1的值为"+map.get("1"));
		}
		System.out.println("这个双列集合中所有键的集合是"+map.keySet());
		System.out.println("这个双列集合中所有键的集合是"+map.values());
		map.replace("1", "Andy");
		System.out.println(map);
		map.remove("1");
		System.out.println(map);
		System.out.println("用链集便历双列集合的键和值");
		Set<String> jianji=map.keySet();
		Iterator<String> diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key=(Object) diedai.next();
			Object value=map.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println("用键值对双集遍双列集合的键和值");	
		Set<?> jianzhiduiji=map.entrySet();
		Iterator<?> diedai2=jianzhiduiji.iterator();
		while(diedai2.hasNext()) {
			Map.Entry jianzhidui = (Map.Entry) diedai2.next();
			Object key=jianzhidui.getKey();
			Object value=jianzhidui.getValue();
			System.out.println(key+":"+value);		
		}
		System.out.println(map);
		map.forEach((key,value)->System.out.println(key+":"+value));
		System.out.println(map);
		Collection<String> values=map.values();
		values.forEach(v->System.out.println(v));
		
		Map<Integer, String> map2=new LinkedHashMap<Integer, String>();
		map2.put(2, "Rose");
		map2.put(1, "Jack");
		map2.put(3, "Lucy");
		map2.forEach((key,value)->System.out.println(key+":"+value));
	}

}
