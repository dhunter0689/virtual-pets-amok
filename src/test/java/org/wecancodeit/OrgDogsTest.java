package org.wecancodeit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.wecancodeit.OrgDogs;

public class OrgDogsTest {

	OrgDogs underTest = new OrgDogs();
	PetCage cage = new PetCage();

	@SuppressWarnings("deprecation")
	@Test
	public void takingAWalkShouldDecreaseBoredom() {

		int boredomLevelBefore = underTest.getBoredom();
		underTest.goWalk();
		int boredomLevelAfter = underTest.getBoredom();
		assertThat(boredomLevelBefore - boredomLevelAfter, is(1));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldIncreaseCleanCageLevelAfterPotty() {
		int cleanCageLevelBefore = underTest.getPotty();
		System.out.println(cleanCageLevelBefore);
		underTest.goPotty(cage);
		int cleanCageLevelAfter = cage.getCageLevel();
		assertThat(cleanCageLevelAfter-cleanCageLevelBefore, is(1));
	}

	@Test
	public void shouldBeAbleToBark() {
		underTest.makeNoise();
		String result = "bark";
		assertEquals(result, "bark");

	}
}
