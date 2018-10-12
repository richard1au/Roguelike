package Model.Item;

/**
 * Representation of an arrow, which can kill enemies at range
 * at the direction it was used by the player.
 *
 */
public class Arrow extends RangedWeapon {
	
	public Arrow() {
		super();
	}
	
	/**
	 * Returns true/false if arrow is being compared to arrow
	 * @param Object to be compared to
	 * @return True/false
	 */
	public boolean equals(Object o) {
		if(o instanceof Arrow) {
			return true;
		}
		return false;
	}

	/**
	 * Determines if arrows can be stacked in inventory
	 * @return Returns true
	 */
	@Override
	public boolean isStackable() {
		// TODO Auto-generated method stub
		return true;
	}
	
}