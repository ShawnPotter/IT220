/*
 * Shawn Potter
 * 
 * Adventure Game
 * 
 * Sets up the attributes of the RoadTile object 
 * 
 * 5/26/2018
 * RoadTile.java
 */


package tiles;

import game.Game;

public class RoadTile extends BasicTile {
	
	//constructor
	public RoadTile (TileType ROAD) {
		super(ROAD);
		
	}
	
	//implements the results of the player stepping on the tile
	@Override
	public void visitTile(Game game) {
		if(game.getPlayer() instanceof players.Squire)
			game.getPlayer().setCurrentFatigue(game.getPlayer().getCurrentFatigue()+1);
		
		game.getPlayer().stepsOnRoad();
	}
}
