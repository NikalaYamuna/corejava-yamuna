package com.javaIntroduction.constructor;

class Vehicle{
	String type;
	 Vehicle(String type) {
	this.type=type;
	}
}
class Car extends Vehicle{
	
	
	String brand;
	double price;
	 Car(String type,String brand,double price) {
	super(type);
	this.brand=brand;
	this.price=price;
	
	}
}
class ElectricalCar extends Car{
	String batteryrange;
	 ElectricalCar(String type,String brand,double price,String batteryrange) {
		 super(type, brand, price);
		 this.batteryrange=batteryrange;
		 
		
	}
	 void display() {
		System.out.println("Type:"+type); 
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		System.out.println("BatteryRange:"+batteryrange);
	 }
}



public class Vehicle1 {

	public static void main(String[] args) {
     
		ElectricalCar e1=new ElectricalCar("Electric", "Tesla", 5000000, "5000km");
		e1.display();
		

	}
	
	

}
