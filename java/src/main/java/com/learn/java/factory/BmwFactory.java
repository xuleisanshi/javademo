package com.learn.java.factory;

public class BmwFactory implements CarFactory
{

    @Override
    public Car createCar()
    {
        // TODO Auto-generated method stub
        return new Bmw();
    }
}
