package org.wecancodeit;

public class LitterBox {

	
	private static final int DEFAULT_LIT_BOX_CLEAN = 0;
	private int litBoxClean = DEFAULT_LIT_BOX_CLEAN;
	//would like the organic cats to use the litter box
	
	
	public int getLitBoxClean () {
		
		return litBoxClean;
	}
	
	public void addpoop(int amount) {
		litBoxClean += amount;
		
	}
	
	
}
