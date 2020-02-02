package org.wecancodeit;

public class ShelterPets {

	public ShelterPets() {
		super();
	}
	
	private int hunger;
	private int thirst;
	private int boredom;
	private int hygiene;
	private int health;
	private int energy;
	private int potty;
	
	protected void makeNoise () {
		System.out.println("");
	}
	
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getHunger() {	
		return hunger;
	}
	
	
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public int getEnergy() {	
		return energy;
	}
	

public void setBoredom(int boredom) {
	this.boredom = boredom;
}
	public int getBoredom() {
		return boredom;
	
	}
	
	public void setPotty(int potty) {
		this.potty = potty;
	}
	public int getPotty() {
		return potty;
	}
	
	public int getHygiene() {
		return hygiene;
	}
	public void setHygiene(int hygiene) {
		this.hygiene = hygiene;
	}

	
	public void setThirst(int thirst) {
		this.thirst = thirst;
	}

	public int getThirst() {
		return thirst;
	}

	
	
	public void setHealth(int health) {
		this.health = health;
	}
	public int getHealth() {
		return health;
	}



	



	

	

}