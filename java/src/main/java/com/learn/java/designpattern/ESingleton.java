package com.learn.java.designpattern;

//较为推荐使用，降低了内存的使用效率，但是没有了lazy loading的效果
public class ESingleton {
	private static ESingleton instance = new ESingleton();

	private ESingleton() {	}

	public static ESingleton getInstance() {
		return instance;
	}
}
