package org.wecancodeit;

public class OrgDogs extends OrganicPets {

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
	
}
