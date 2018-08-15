package com.learn.java.factory;

public class CarSimpleFactroyDemo {
	public static void main(String[] argu) throws Exception {
		CarSimpleFactory carSimpleFactory = new CarSimpleFactory();
		carSimpleFactory.createCar("BMW").create();
		carSimpleFactory.createCar("Benz").create();
		carSimpleFactory.createCar("Audi").create();

	}
}
