package org.wecancodeit;

public class ShelterPets {

	public ShelterPets() {
		super();
	}

	private String name;
	private String description;

	private int hunger;
	private int thirst;
	private int boredom;
	private int hygiene;
	protected int health;
	private int energy;
	private int potty;

	
	public int tick() {// tick all levels here
		return 0;
	}
	
	public ShelterPets(String petName, String petDescription) {
		name = petName;
		description = petDescription;
	}
	
	protected void makeNoise() {
		System.out.println("");
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	
	
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getHunger() {
		return hunger;
	}
	

	public void eat() {
		this.hunger --;
		this.health ++;
	}

	
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getEnergy() {
		return energy;
	}
	
	public void sleep() {
		this.energy +=2;		
	}

	
	public void setBoredom(int boredom) {
		this.boredom = boredom;
	}

	public int getBoredom() {
		return boredom;

	}
	
	public void play() {
		this.boredom -=2;
		this.hygiene --;
		this.energy --;
	}

	public void setPotty(int potty) {
		this.potty = potty;
	}

	public int getPotty() {
		return potty;
	}
	
	public void goPotty() {
		this.potty -= 3;
	}

	
	public int getHygiene() {
		return hygiene;
	}

	public void setHygiene(int hygiene) {
		this.hygiene = hygiene;
	}
	
	public void bathe () {
		this.hygiene += 3;
	}

	public void setThirst(int thirst) {
		this.thirst = thirst;
	}

	public int getThirst() {
		return thirst;
	}
	
	public void drink() {
		this.thirst -=2;
		
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHealth() {
		return health;
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

