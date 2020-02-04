package org.wecancodeit;

public class LitterBox {

	
	private static final int MAX_LIT_BOX_CLEAN = 7;
	private static final int DEFAULT_LIT_BOX_CLEAN = 0;
	private int litBoxClean;
	//would like the organic cats to use the litter box
	
	
	public int getLitBoxClean () {
		
		return litBoxClean;
	}
	
	public void addpoop(int amount) {
		litBoxClean += amount;
		
	}
	
	
}
