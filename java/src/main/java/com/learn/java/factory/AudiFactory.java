package com.learn.java.factory;

public class AudiFactory implements CarFactory
{

    @Override
    public Car createCar()
    {
        return new Audi();
    }

}
