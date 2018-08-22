package com.learn.java.factory;

public class Benz implements Car
{

    public Benz()
    {
        System.out.println("Benz Created!!!");
    }

    @Override
    public void run()
    {
        System.out.println("Benz Run!!!");
    }

}
