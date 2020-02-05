package org.wecancodeit;

public class PetCage {
//monitors poop levels of Dogs and birds
	
	private int cageLevel;

	public int getCageLevel() {
		return cageLevel;
	}

	public void addpoop(int amount) {
		cageLevel += 1;
		
	}
	
}
