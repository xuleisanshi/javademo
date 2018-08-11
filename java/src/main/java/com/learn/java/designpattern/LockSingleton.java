package com.learn.java.designpattern;
//理论上线程安全实现了lazy loading
public class LockSingleton {
    private volatile static LockSingleton instance;
    private LockSingleton(){
    }
    public static LockSingleton getInstance(){
        if(instance==null){
            synchronized (LockSingleton.class){
                if(instance==null){
                    instance=new LockSingleton();
                }
            }
        }
        return instance;
    }
}