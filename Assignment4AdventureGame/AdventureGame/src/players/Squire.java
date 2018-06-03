/*
 * Shawn Potter
 * 
 * Adventure Game
 * 
 * The Squire class which extends the Player class. Attributes specific to the Knight are held here
 * 
 * 5/26/2018
 * Squire.java
 */

package players;

public class Squire extends Player {
	
	// default constructor
	public Squire() {
		super();
	}
	
	// 3 param constructor
	public Squire(String playerName, int maxFatigue, int maxSteps) {
		super(playerName, maxFatigue, maxSteps);
		maxSteps = 2;
		maxFatigue = 15;
	}
	
	// methods to generate responses for stepping on specific tiles
	public void stepsInMud() {
		System.out.println("I grew up in the mud, this won't affect me!");
	}
	public void stepsOnGrass() {
		System.out.println("I love the open grassy fields.");
	}
	public void stepsOnRoad() {
		System.out.println("I wonder how long this road will go on.");
	}
	public void stepsOnTrap() {
		System.out.println("Ugh a trap!");
	}
}
