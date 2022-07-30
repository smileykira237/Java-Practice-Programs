package com.revature.controllers;

import java.util.Scanner;

import com.revature.models.Adopter;
import com.revature.services.AdopterService;



public class RegisterController {
	
	private Scanner scan = new Scanner(System.in);
	private AdopterService adoptServ = new AdopterService();
	
	public void register() {
		System.out.println("First I need to get some information. What is your name?");
		
		String name = scan.nextLine();
		
		System.out.println("Hello "+name+" are you a good pet parent?");
		
		String answer = scan.nextLine();
		
		boolean good = false;
		if(answer.toLowerCase().trim().equals("yes")){
			good=true;
		}
		
		Adopter adopter = new Adopter(name, good);
		
		adoptServ.newAdopter(adopter);
		
		
	}

}