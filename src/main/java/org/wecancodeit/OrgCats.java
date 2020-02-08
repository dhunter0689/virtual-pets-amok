package org.wecancodeit;
public class OrgCats extends OrganicPets {
 
public OrgCats(String name, String description) {
		
	}

@Override
public void makeNoise() {
	meow();
}

private void meow() {
	System.out.println("meow");
	
}

public void goPotty(LitterBox litbox) {
	litbox.addpoop(1);
	
	
}

public void decreaseHealth() {
	health -=2;
	
}

	


	}

	

	


