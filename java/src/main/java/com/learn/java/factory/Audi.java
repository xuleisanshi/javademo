package com.learn.java.factory;

public class Audi implements Car
{
    public Audi()
    {
        System.out.println("Audi Created!!!");
    }

    @Override
    public void run()
    {
        System.out.println("Audi Run!!!");
    }
}
