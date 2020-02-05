package org.wecancodeit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, ShelterPets> virtualPets = new HashMap<String, ShelterPets>();

	Map<String, RoboticPets> roboticanimals = new HashMap<String, RoboticPets>();

	public Collection<ShelterPets> pets() {
		return virtualPets.values();
	}

	public Collection<RoboticPets> robopets() {
		return roboticanimals.values();
	}

	LitterBox litterBox = new LitterBox();

	public void getLitBoxClean() {
		litterBox.getLitBoxClean();
	}

	public void upkeepAllRobos() {
		for (RoboticPets pet : robopets()) {
			if (pet instanceof RoboticPets) {
				((RoboticPets) pet).oilPet();
			}
		}
	}

	public void cleanPetCage() {
		for(ShelterPets pet : pets()) {
			if(pet instanceof OrgDogs) {
				((OrgDogs) pet).cleanPetCage();
			}
		}
	}
	
	public void walkDogs() {
		for (ShelterPets pet : pets()) {
			if (pet instanceof OrgDogs) {
				((OrgDogs)pet).goWalk();
			}
		}
	}
	
	public void feedAllOrganic() {
		for (ShelterPets pet : pets()) {
			if (pet instanceof OrganicPets) {
				((OrganicPets)pet).eat();
			}
		}
	}
	
	public void giveWaterAllOrganic() {
		for (ShelterPets pet : pets()) {
			if(pet instanceof OrganicPets) {
				((OrganicPets)pet).drink();
			}
		}
	}
}
