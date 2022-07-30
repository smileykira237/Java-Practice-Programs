package com.revature.services;

import com.revature.models.Adopter;
import com.revature.repositories.AdopterRepo;

public class AdopterService {
	
	private AdopterRepo adoptRepo = new AdopterRepo();
	
	//Business logic to change name to lower case for storage in database. 
	public void newAdopter(Adopter adopter) {
		adopter.setName(adopter.getName().toLowerCase());
		//save into "database"
		adoptRepo.storeAdopter(adopter);
	}

	
	public boolean isGoodPetParent(String name) {
		Adopter a = adoptRepo.getAdopterByName(name);
		return a.isGoodPetParent();
	}
}