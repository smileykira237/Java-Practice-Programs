package com.revature;

import com.revature.controllers.CanAdoptController;
import com.revature.controllers.RegisterController;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello, welcome to my pet adoption app!");
		
		RegisterController rCont = new RegisterController();
		
		rCont.register();
		
		CanAdoptController cac = new CanAdoptController();

	}

}
