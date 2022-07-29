package com.revature.models;

public class Car {		
	public String color;
	public String model;
	public String vin;
	
	public Car(String color, String model, String vin) {
		this.color = color;
		this.model = model;
		this.vin = vin;
	}
	
	public Car() {
	}
	
	public String drive(int distance) {
		return "The " + model + " drives " + distance + " miles forward.";
	}
	public void turn(String direction) {
		System.out.println("The car is turning to the " + direction);
	}
	
	public void driveForward(int distance) {
		if (distance > 0) {
		System.out.println(drive(distance));
		}else {
			System.out.println(distance + " is not a valid distance");
		}
	}

}
