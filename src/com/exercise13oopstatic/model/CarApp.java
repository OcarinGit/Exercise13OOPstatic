package com.exercise13oopstatic.model;

public class CarApp {

	public static void main(String[] args) {
		Car edgarCar = new Car();
		Car luisCar = new Car();
		Car aleCar = new Car();
		Car crisCar = new Car();
		Car hellCar = new Car();
		Car manuCar = new Car();
		Car aryCar = new Car();
		
		edgarCar.setSerialNumber("1");
		edgarCar.setNumberDoors(4);
		edgarCar.setBrand("Volvo");
		luisCar.setSerialNumber("2");
		luisCar.setNumberDoors(4);
		luisCar.setBrand("Volvo");
		aleCar.setSerialNumber("3");
		aleCar.setNumberDoors(4);
		aleCar.setBrand("Volvo");
		crisCar.setSerialNumber("4");
		crisCar.setNumberDoors(4);
		crisCar.setBrand("Honda");
		hellCar.setSerialNumber("5");
		hellCar.setNumberDoors(4);
		hellCar.setBrand("Honda");
		manuCar.setSerialNumber("6");
		manuCar.setNumberDoors(4);
		manuCar.setBrand("Honda");
		aryCar.setSerialNumber("7");
		aryCar.setNumberDoors(4);
		aryCar.setBrand("Honda");
		System.out.println("Edgar:"+edgarCar.ToString());
		System.out.println("Luis:"+luisCar.ToString());
		System.out.println("Ale:"+aleCar.ToString());
		System.out.println("Cris:"+crisCar.ToString());
		System.out.println("Hell:"+hellCar.ToString());
		System.out.println("Manu:"+manuCar.ToString());
		System.out.println("Ary:"+aryCar.ToString());
		crisCar.CarIsCoupe(true);
		System.out.println();
		System.out.println("Edgar:"+edgarCar.ToString());
		System.out.println("Luis:"+luisCar.ToString());
		System.out.println("Ale:"+aleCar.ToString());
		System.out.println("Cris:"+crisCar.ToString());
		System.out.println("Hell:"+hellCar.ToString());
		System.out.println("Manu:"+manuCar.ToString());
		System.out.println("Ary:"+aryCar.ToString());
		crisCar.numberDoors = 3;
		System.out.println();
		System.out.println("Edgar:"+edgarCar.ToString());
		System.out.println("Luis:"+luisCar.ToString());
		System.out.println("Ale:"+aleCar.ToString());
		System.out.println("Cris:"+crisCar.ToString());
		System.out.println("Hell:"+hellCar.ToString());
		System.out.println("Manu:"+manuCar.ToString());
		System.out.println("Ary:"+aryCar.ToString());
		Car.numberDoors=5;
		System.out.println();
		System.out.println("Edgar:"+edgarCar.ToString());
		System.out.println("Luis:"+luisCar.ToString());
		System.out.println("Ale:"+aleCar.ToString());
		System.out.println("Cris:"+crisCar.ToString());
		System.out.println("Hell:"+hellCar.ToString());
		System.out.println("Manu:"+manuCar.ToString());
		System.out.println("Ary:"+aryCar.ToString());
	}

}
