package com.revature.repositories;

import com.revature.models.Adopter;

public class AdopterRepo {
	
	private static Adopter[] adopters = new Adopter[5];
	
	public void storeAdopter(Adopter adopter) {
		for(int i=0; i<adopters.length; ++i) {
			if(adopters[i]==null) {
				adopters[i]=adopter;
				return;
			}
		}
	}
	
	public Adopter getAdopterByName(String name) {
		for(Adopter a:adopters) {
			if(a.getName().equals(name)) {
				return a;
			}
		}
		return null;
	}

}