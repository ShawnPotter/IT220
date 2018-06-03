/*
 * Shawn Potter
 * 
 * Adventure Game
 * 
 * Sets up the attributes of the MudTile object 
 * 
 * 5/26/2018
 * MudTile.java
 */

package tiles;

import game.Game;

public class MudTile extends BasicTile {
	
	//constructor
	public MudTile (TileType MUD) {
		super(MUD);
		
	}

	//implements the results of the player stepping on the tile
	@Override
	public void visitTile(Game game) {
		if(!(game.getPlayer() instanceof players.Squire))
			game.getPlayer().setCurrentFatigue(game.getPlayer().getCurrentFatigue()+2);
		game.getPlayer().stepsInMud();
	}
}
