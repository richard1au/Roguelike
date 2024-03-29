package Model.Item;

import Model.Player;
import javafx.scene.image.Image;

/**
 * Representation of an arrow, which can kill enemies at range
 * at the direction it was used by the player.
 *
 */
public class Arrow extends RangedWeapon {
	
	public Arrow() {
		super();
	}
	
	public void pickedUp(Player player) {
		player.getInventory().storeItem(this);
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
		return true;
	}
	public String toString() {
		return "Arrow x" + getQuantity();
	}

	@Override
	public Image getImage() {
		return new Image("assets/itemassets/arrow.png");
	}
	
	
}
