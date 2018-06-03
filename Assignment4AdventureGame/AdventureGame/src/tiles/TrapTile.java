/*
 * Shawn Potter
 * 
 * Adventure Game
 * 
 * Sets up the attributes of the TrapTile object 
 * 
 * 5/26/2018
 * TrapTile.java
 */

package tiles;

import game.Game;

public class TrapTile extends BasicTile {
	
	//constructor
	public TrapTile(TileType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	
	//implements the results of the player stepping on the tile
	@Override
	public void visitTile(Game game) {
		if(!(game.getPlayer() instanceof players.Princess)) {
			game.getPlayer().setCurrentFatigue(game.getPlayer().getCurrentFatigue()+2);
			game.movePlayer(-1);
		}
		game.getPlayer().stepsOnTrap();
	}
}
