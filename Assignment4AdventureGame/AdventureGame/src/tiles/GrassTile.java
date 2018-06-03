/*
 * Shawn Potter
 * 
 * Adventure Game
 * 
 * Sets up the attributes of the GrassTile object 
 * 
 * 5/26/2018
 * GrassTile.java
 */

package tiles;

import game.Game;

public class GrassTile extends BasicTile {
	
	//constructor
	public GrassTile (TileType GRASS) {
		super(GRASS);
		
	}
	
	//implements the results of the player stepping on the tile
	@Override
	public void visitTile(Game game) {
		game.getPlayer().setCurrentFatigue(game.getPlayer().getCurrentFatigue()+1);
		game.getPlayer().stepsOnGrass();
	}
}
