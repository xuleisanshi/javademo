package com.learn.java.factory;

public class CarFactoryDemo
{
    public static void main( String[] args )
    {

        BenzFactory benzFactory = new BenzFactory();
        benzFactory.createCar().run();
    }
}
