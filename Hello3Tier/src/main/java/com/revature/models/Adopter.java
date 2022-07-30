package com.revature.models;

import java.util.Objects;

//This is a POJO - Plain Old Java Object.
public class Adopter {
	
	private String name;
	private boolean goodPetParent;
	
	public Adopter(String name, boolean goodPetParent) {
		super();
		this.name = name;
		this.goodPetParent = goodPetParent;
	}

	public Adopter() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.equals("")) {
			return;
		}
		this.name = name;
	}

	public boolean isGoodPetParent() {
		return goodPetParent;
	}

	public void setGoodPetParent(boolean goodPetParent) {
		this.goodPetParent = goodPetParent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (goodPetParent ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adopter other = (Adopter) obj;
		if (goodPetParent != other.goodPetParent)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Adopter [name=" + name + ", goodPetParent=" + goodPetParent + "]";
	}

	

}