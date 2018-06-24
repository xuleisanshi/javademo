package com.learn.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/*
 * 每个位置只有一个元素
 */
public class CollectionTest {
	public static void main(String[] agrs) {
		String s1 = "a";
		String s2 = "b";
		String s3 = "a";
		/*
		 * 有序
		 */
		System.out.println("=========List=======");
		List<String> list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		for (String s : list) {
			System.out.println(s);
		}
		list.forEach(lis -> System.out.println(lis));

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println("迭代： " + it.next());

		}
		System.out.println(list.toString());
		System.out.println(list.get(2));
		List<String> list1 = new ArrayList<String>();
		list1 = list;
		System.out.println(list1.toString());

		/*
		 * 无重复数元素
		 */
		System.out.println("========Set========");
		Set<String> set = new HashSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		System.out.println(set.toString());
		/*
		 * 队列，先进先出的顺序
		 */
		System.out.println("=========Queue=======");
		Queue<String> queue = new LinkedList<String>();
		queue.add(s1);
		queue.add(s2);
		queue.add(s3);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
