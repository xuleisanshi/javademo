package com.learn.java.designpattern;

//懒汉式
public class LSingleton {
	private static LSingleton instance;

	private LSingleton() {

	}

	// Synchronized保证了线程的安全
//	public static synchronized LSingleton getInstance() {
//		if (instance == null) {
//			instance = new LSingleton();
//		}
//		return instance;
//	}
	 //无法保证并发时的安全
	 public static LSingleton getInstance() {
	 if (instance == null) {
	 instance = new LSingleton();
	 }
	 return instance;
	 }
}
