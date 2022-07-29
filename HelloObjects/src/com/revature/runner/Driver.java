package com.revature.runner;

import com.revature.models.Car;

public class Driver {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.color = "white";
		car1.model = "challenger";
		car1.vin = "KG6895FD6397K";
		
		System.out.println(car1.color + " " + car1.model + " " + car1.vin);
		
		Car car2 = new Car("red", "rx-8", "JDK268974GT568I");
		
		System.out.println(car2.color + " " + car2.model + " " + car2.vin);
		
		car1.turn("right");
		
		car1.driveForward(-10);
		car1.driveForward(10);
		
		

	}

}
