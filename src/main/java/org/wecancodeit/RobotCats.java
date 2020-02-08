package org.wecancodeit;

public class RobotCats extends RoboticPets {

	public RobotCats(String name, String description) {
	
	}

	@Override
	public void makeNoise() {
		meow();
	}
	
	private void meow() {
		System.out.println("meow");
			
		}
}
