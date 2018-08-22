package com.learn.java.factory;


public class Bmw implements Car
{
    public Bmw() {
        System.out.println("BMW Created!!!");
    }
    @Override
    public void run()
    {
        System.out.println("BMW Run!!!");
    }
}
