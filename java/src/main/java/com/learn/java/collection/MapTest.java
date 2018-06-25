package com.learn.java.collection;

import java.util.HashMap;

/*
 * 键值对
 */
public class MapTest {
	public static void main(String[] args) {
		/*
		 * key-value
		 */
		System.out.println("=========Map=======");
		HashMap<Integer, String> map = new HashMap();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map.toString());
		System.out.println(map.get(1));
		System.out.println(map.containsKey(0));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.replace(1, "aa"));
		System.out.println(map.toString());
		System.out.println(map.size());
		map.forEach((k,v)->{if(k==1) {System.out.println(v);}});
	}

}
