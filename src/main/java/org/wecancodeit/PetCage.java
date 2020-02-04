package org.wecancodeit;

public class PetCage {
//monitors poop levels of Dogs and birds
	
	private int CageLevel;

	public int getCageLevel() {
		return CageLevel;
	}

	public void addpoop(int amount) {
		CageLevel += 1;
		
	}
	
}
