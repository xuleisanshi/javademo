package com.learn.java.factory;

public class BenzFactory implements CarFactory
{

    @Override
    public Car createCar()
    {
        return new Benz();
    }

}
