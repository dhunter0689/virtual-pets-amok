package org.wecancodeit;

public class RoboticPets {

	private int oil;
	private String name;

	public void setOil(int oil) {
		this.oil = oil;
	}
	
	public int getOil() {
		
		return oil;
	}
	
	public void oilPet() {
		this.oil +=3;
	}

	public void makeNoise() {
		System.out.println("");
		
	}

	public String getName() {
		
		return name;
	}

}
