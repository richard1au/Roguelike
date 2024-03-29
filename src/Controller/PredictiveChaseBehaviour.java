package Controller;

import java.awt.Point;

import Model.Dungeon;
import Model.Tile.Exit;

public class PredictiveChaseBehaviour extends MoveBehaviour {

	@Override
	public Point getTarget(Dungeon map, Point currPos) {
		return predict(map, currPos);
	}

	/**
	 * Predict players next moves and return Point
	 * @param map the whole map
	 * @param currPos current position of Strategist
	 * @return the point of prediction (to move)
	 */
	private Point predict(Dungeon map, Point currPos) {
		Point prediction;
		if ((prediction = predictExit(map)) == null) {
			if ((prediction = predictTreasure(map)) == null) {
				prediction = map.getPlayerPos();
			}
		}
		return prediction;
	}
	
	
	/**
	 * Predict a point to move for win condition: EXIT
	 * @param map the whole map
	 * @return the path of player towards exit
	 */
	private Point predictExit(Dungeon map) {
		Point exit = getExitPoint(map);
		if (exit == null) return null;

		Point player = map.getPlayerPos();
		int predictX = (exit.x + player.x)/2;
		int predictY = (exit.y + player.y)/2;

		Point prediction = new Point(predictX, predictY);
		return prediction;
	}
	
	/**
	 * Get point of Exit if there is one
	 * @param map the whole map
	 * @return the point of EXIT, null if not exist
	 */
	private Point getExitPoint(Dungeon map) {
		for (int x=0; x <=map.MAX_SIZE; x++) {
			for (int y=0; y <= map.MAX_SIZE; y++) {
				Point temp = new Point(x, y);
				if (map.getTile(temp) instanceof Exit) return temp;
			}
		}
		return null;
	}

	/** Incomplete
	 * Get point of Treasure if there is one
	 * @param map the whole map
	 * @return the point of Treasure, null if not exist
	 */
	private Point predictTreasure(Dungeon map) {
		// To-Do
		return null;
	}

}