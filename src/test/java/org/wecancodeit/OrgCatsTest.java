package org.wecancodeit;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.wecancodeit.LitterBox;
import org.wecancodeit.OrgCats;

public class OrgCatsTest {
	
	OrgCats underTest = new OrgCats ();
	LitterBox litbox = new LitterBox();
	
	@Test
	public void shouldBeAbleToHaveDefaultHungerOf0() {
		int result = underTest.getHunger();
		assertEquals(result, 0);
		
	}
			
	@Test
	public void shouldBeAbleToHaveDefaultEnergyOf0() {
		int result = underTest.getEnergy();
		assertEquals( result, 0);
	}

	@Test
	public void shouldBeAbleToHaveDefaultBoredomOf0() {
		int result = underTest.getBoredom();
		assertEquals(result, 0);
	}
	
	@Test
	public void shouldBeAbleToDefaultPottyLevelOf0() {
		int result = underTest.getPotty();
		assertEquals(result, 0);
	}
	
	@Test
	public void shouldHaveDefaultHygieneOf0() {
		int result = underTest.getHygiene();
		assertEquals(result, 0);
	}
	
	@Test
	public void shouldBeAbleToMeow() {
		 underTest.makeNoise();
		 String result = "meow";
		assertEquals(result, "meow");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void shouldIncreaseLitterBoxCleanlinessWhenPotty() {
		int litboxcleanbefore = underTest.getPotty();
		System.out.println(litboxcleanbefore);
		underTest.goPotty(litbox);
		int litboxcleanafter = litbox.getLitBoxClean();
		assertThat(litboxcleanafter-litboxcleanbefore , is(1));
	}
}
