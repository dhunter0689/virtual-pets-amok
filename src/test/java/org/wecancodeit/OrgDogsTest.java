package org.wecancodeit;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.wecancodeit.OrgDogs;

public class OrgDogsTest {
	
	OrgDogs underTest = new OrgDogs();
	
@SuppressWarnings("deprecation")
@Test
public void takingAWalkShouldDecreaseBoredom() {
	
	int boredomLevelBefore = underTest.getBoredom();
	underTest.goWalk();
	int boredomLevelAfter =underTest.getBoredom();
	assertThat(boredomLevelBefore-boredomLevelAfter, is(1));
}

}
