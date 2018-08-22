package com.learn.java.factory;

public class CarSimpleFactroyDemo {
	public static void main(String[] argu) throws Exception {
		CarSimpleFactory carSimpleFactory = new CarSimpleFactory();
		carSimpleFactory.createCar("BMW").run();
		carSimpleFactory.createCar("Benz").run();
		carSimpleFactory.createCar("Audi").run();

	}
}
