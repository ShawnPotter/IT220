/*
 * Shawn Potter
 * 
 * Adventure Game
 * 
 * The Knight class which extends the Player class. Attributes specific to the Knight are held here
 * 
 * 5/26/2018
 * Knight.java
 */

package players;

public class Knight extends Player {
	
	// default constructor
	public Knight() {
		super();
	}
	
	// 3 param constructor
	public Knight(String playerName, int maxFatigue, int maxSteps) {
		super(playerName, maxFatigue, maxSteps);
	}

	// methods to generate responses for stepping on specific tiles
	public void stepsInMud() {
		System.out.println("Mud, yuck, mud everywhere!");
	}
	public void stepsOnGrass() {
		System.out.println("This grass is slowing me down.");
	}
	public void stepsOnRoad() {
		System.out.println("This road is more to my liking.");
	}
	public void stepsOnTrap() {
		System.out.println("Lucky my armor is on, ouch!");
	}
}
