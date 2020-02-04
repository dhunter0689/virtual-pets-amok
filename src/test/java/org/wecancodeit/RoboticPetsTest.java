package org.wecancodeit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboticPetsTest {
	
	RoboticPets robopets = new RoboticPets();
	
	@Test
	public void shouldReturnOilLevel() {
		int result = robopets.getOil();
		assertEquals(result, 0);
	}

}
