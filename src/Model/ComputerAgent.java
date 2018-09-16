package Model;

import java.awt.Point;

/**
 * ComputerAgent encompasses non-player entities within the dungeon
 * which have movement, health and interactions with other
 * entities.
 * @author Richard
 *
 */
public abstract class ComputerAgent {

	/**
	 * @param moveBehaviour strategy which defines how computeragents traverse the map
	 * @param pos current position in Point form within Dungeon
	 */
	private MoveBehaviour moveBehaviour;
	private Point pos;

	public ComputerAgent(int healthPoints, MoveBehaviour moveBehaviour) {
		this.moveBehaviour = moveBehaviour;
	}

	/**
	 * Moves the ComputerAgent based on movement strategy
	 * @param map The dungeon currently being played
	 * @return position which has been calculated for movement
	 */
	public Point move(Dungeon map) {
		setPos(moveBehaviour.move(map, pos));
		return this.pos;
	}
	/**
	 * Sets updated position in Point form of the ComputerAgent
	 * @param newPos New position to update to
	 */
	public void setPos(Point newPos) {
		this.pos = newPos;
	}
	/**
	 * Gives current position
	 * @return Current position in Point form
	 */
	public Point getPos() {
		return this.pos;
	}
	
}





