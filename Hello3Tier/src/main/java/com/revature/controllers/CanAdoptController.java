package com.revature.controllers;

import java.util.Scanner;

import com.revature.services.AdopterService;

public class CanAdoptController {
	
	Scanner scan = new Scanner(System.in);
	AdopterService aser = new AdopterService();
	
	public void canTheyAdopt() {
		System.out.println("What is your name? ");
		
		String name = scan.nextLine();
		
		if(aser.isGoodPetParent(name)) {
			System.out.println("Yes you can adopt, here are our pet options.");
		}else {
			System.out.println("We only allow good pet parents to have pets. Sorry. Get gud.");
		}
	
	}

}
