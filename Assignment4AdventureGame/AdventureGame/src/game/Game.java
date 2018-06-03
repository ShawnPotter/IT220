/*
 * Shawn Potter
 * 
 * Adventure Game
 * Players move down an array with Tile objects inside. Certain tiles have certain effects associated with them
 * dependant on the player's class of character.
 * 
 * 5/26/2018
 * Game.java
 */


package game;

import java.util.Random;
import java.util.Scanner;

import players.Player;
import tiles.BasicTile;
import tiles.GrassTile;
import tiles.MudTile;
import tiles.RoadTile;
import tiles.TileType;
import tiles.TrapTile;

public class Game {
	private static Scanner kb = new Scanner(System.in);
	
	// stores tile objects
	private BasicTile[] tiles;
	

	/*
	 * stores the index of player (which tile the player is located within inside
	 * the tiles array
	 */
	private int position = -1;

	// the player object
	private Player player;
	
	//number of tiles set by the player
	private int numTiles;
	
	//constructor
	public Game(int numTiles, Player player) {
		this.numTiles = numTiles;
		this.player = player;
		tiles = new BasicTile[numTiles];
	}

	// public methods

	public void startGame() {
		// this creates our array of tile objects
		buildTiles();

		/*
		 * The main game loop should be declared here. Each turn the player should move
		 * a random distance forward from 1 to maxSteps.
		 * 
		 * NOTE: maxSteps should be stored in the Player class and should be 2 for
		 * Knights and 3 for squires or princesses.
		 */
		Random gen = new Random();
		int distance = 0;
		
		boolean gameOver = false;
		while (!gameOver) {
			//random num gen to get the number of steps the player makes
			distance = gen.nextInt(player.getMaxSteps()) + 1;
			
			//if the player's level of fatigue is over their max game is over
			if(player.getCurrentFatigue() > player.getMaxFatigue()) {
				gameOver=true;
			}

			//if movePlayer returns true the player moves and text is printed out
			else if(movePlayer(distance)==true) {
				
				if(position < tiles.length - 1) {
					
					System.out.println("Player moves " + distance + " step(s) to a "+ tiles[position].getType() +" tile");
					
					tiles[position].visitTile(this);
					
					//print out current array with player position
					System.out.println(this.toString());
					
					//print out the player's fatigue levels
					System.out.println("Player Fatigue: "+player.getCurrentFatigue()+"/"+player.getMaxFatigue()+"\n");
					
					//if the player's fatigue levels are lower then max ask if they want to continue
					if(player.getCurrentFatigue() <= player.getMaxFatigue()) {
						System.out.print("Do you want to quit playing?(true/false) ");
						gameOver = kb.nextBoolean();
						System.out.println();
					}
				}
			}else
				gameOver=true;
		}
		//if too fatigued tell the player
		if(player.getCurrentFatigue() >= player.getMaxFatigue())
			System.out.println("\nYou are too fatigued to continue");
		
		//if the player exits the array tell them they win
		if(position + distance > tiles.length -1)
			System.out.println("\nYou made it!");
		
		System.out.println("\nThank you for playing");

	}

	public Player getPlayer() {
		return player;
	}

	public boolean movePlayer(int distance) {
		/*
		 * This method moves the player the given distance. A positive value will move
		 * the player to the later indices in the tiles[] array, while a negative value
		 * will move the player back to lower indices.
		 * 
		 * Return false if the distance passed falls outside the range 0 -->
		 * tiles.length - 1
		 */
		
		//checks to see if moving from the current position will result leaving the array
		if(position + distance > tiles.length -1)
			return false;
		
		//advances the player
		position = position + distance;
		return true;
	}

	// private methods
	private void buildTiles() {
		/*
		 * This method should instantiate tile objects to fill the tiles[] array above.
		 * 10% of the tiles should be trap tiles, 20% mud, 40% grass and 30% road.
		 */
		BasicTile grass = new GrassTile(TileType.GRASS);
		BasicTile trap = new TrapTile(TileType.TRAP);
		BasicTile road = new RoadTile(TileType.ROAD);
		BasicTile mud = new MudTile(TileType.MUD);
		Random random = new Random();
		//System.out.println(numTiles);
		//System.out.println(tiles.length);
		
		for(int i = 0; i < numTiles; i++) {
			int num = random.nextInt(10) + 1;
			if(num >= 1 && num <= 4) {
				tiles[i] = grass;
			} 
			if(num >= 5 && num <= 7) {
				tiles[i] = road;
			} 
			if(num >= 8 && num <= 9) {
				tiles[i] = mud; 
			}
			if(num == 10) {
				tiles[i] = trap;
			}
		}
		
	}

	// prints out the tiles array along with the current player position
	@Override
	public String toString() {
		String result = "[";

		for (int i = 0; i < tiles.length; i++) {
			if (i != 0) {
				result += ", ";
			}

			// player is in this tile
			if (position == i) {
				result += tiles[i].toString() + " - (player)";
			} else {
				result += tiles[i].toString();
			}
		}
		result += "]";

		if (position >= tiles.length) {
			result += " (player)";
		}

		return result;
	}
}
