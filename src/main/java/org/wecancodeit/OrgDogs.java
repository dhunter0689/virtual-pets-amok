package org.wecancodeit;

public class OrgDogs extends OrganicPets {

	private int cageLevel;

	@Override
	public void makeNoise() {
		bark();
	}

	private void bark() {
	System.out.println("bark");
		
	}

	public void goWalk() {
		 setBoredom(getBoredom() - 1);
	}

	public void goPotty(PetCage cage) {
		cage.addpoop(1);
		
	}

	public void cleanPetCage() {
		health += 1;
		setCageLevel(0);
		
	}

	public int getCageLevel() {
		return cageLevel;
	}

	public void setCageLevel(int cageLevel) {
		this.cageLevel = cageLevel;
	}
	
}
