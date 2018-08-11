package com.learn.java.designpattern;

//静态内部类，推荐使用,内部静态方法只在getInstance()方法中调用，具有lazy loading的效果
public class SSingleton {
	private static class SSingletonHolder {
		private static final SSingleton instance = new SSingleton();
	}

	private SSingleton() {

	}

	public static final SSingleton getInstance() {
		return SSingletonHolder.instance;
	}
}
