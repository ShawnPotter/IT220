/*
 * Shawn Potter
 * 
 * Adventure Game
 * 
 * Main interface to run the other classes
 * 
 * 5/26/2018
 * GameDriver.java
 */


package game;

import java.util.Scanner;

import players.*;

public class GameDriver {
	private static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		
		//greet the player
		System.out.println("Welcome to the Longest Adventure.");
		System.out.println("*********************************");

		//ask the player the number of tiles they want
		System.out.print("Please choose a number of tiles: ");
		int tiles = console.nextInt();
		console.nextLine(); // clear enter key from integer input

		System.out.print("Enter your player name: ");
		String name = console.nextLine();

		//ask the player what character they want to play.
		System.out.println("Please choose a player type (knight, princess, squire):");
		System.out.println("Knight - Tough travelers that can weather any adversity!");
		System.out.println("Princess - Smart and savvy, a princess is never caught off guard!");
		System.out.println("Squire - Squires have a knack for getting there quicker!");
		System.out.print("Enter your player type: ");
		String type = console.nextLine();
		System.out.println("\n\n");
		
		
		//with the player's choice instantiate a new game
		if(type.equalsIgnoreCase("Knight")) {
			Game game = new Game(tiles, new Knight(name, 25, 2));
			game.startGame();
		}
		if(type.equalsIgnoreCase("Squire")) {
			Game game = new Game(tiles, new Squire(name, 15, 3));
			game.startGame();
		}
		if(type.equalsIgnoreCase("Princess")) {
			Game game = new Game(tiles, new Princess(name, 12, 3));
			game.startGame();
		}
		
		console.close();
	}
}
