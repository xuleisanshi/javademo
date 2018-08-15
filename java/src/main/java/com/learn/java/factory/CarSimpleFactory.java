package com.learn.java.factory;

public class CarSimpleFactory {
	public Car createCar(String car) throws Exception {
		switch (car) {
		case "BMW":
			return new Bmw();
		case "Benz":
			return new Benz();
		case "Audi":
			return new Audi();
		default:
			throw new Exception("no such car!");
		}
	}
}
