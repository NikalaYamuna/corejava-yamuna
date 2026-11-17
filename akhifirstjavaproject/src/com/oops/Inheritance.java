package com.oops;

class Vehicle {
	String name;
	String speed;
	String stopspeed;

	public void start() {

		System.out.println("Name:" + name);
		System.out.println("It's Starts at Speed:" + speed);

	}

	public void stop() {
		System.out.println("It's Stops at Speed " + stopspeed);
		System.out.println("**************************************");
	}
}

class Car extends Vehicle {

	public void sunroof() {
		System.out.println(name + " sunroof is opening");
	}

}

class Bike extends Vehicle {

	public void doWheeling() {
		System.out.println(name + " is doing wheeling");
	}
}

class Truck extends Vehicle {

	public void loadCargo() {
		System.out.println(name + " Loading cargo");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Car c = new Car();
		c.name = "Roles Royce";
		c.speed = "120km/hr";
		c.stopspeed = "70km/hr";
		Bike b = new Bike();
		b.name = "GT650";
		b.speed = "90km/hr";
		b.stopspeed = "60km/hr";
		Truck t = new Truck();
		t.name = "Tata Motors";
		t.speed = "70km/hr";
		t.stopspeed = "50km/hr";
		c.start();
		c.sunroof();
		c.stop();
		b.start();
		b.doWheeling();
		b.stop();
		t.start();
		t.loadCargo();
		t.stop();

	}

}