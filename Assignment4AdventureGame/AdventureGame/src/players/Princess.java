/* 
 * Shawn Potter
 * 
 * Adventure Game
 * 
 * The Princess class which extends the Player class. Attributes specific to the Knight are held here
 * 
 * 5/26/2018
 * Princess.java
 */

package players;

public class Princess extends Player {
	
	// default constructor
	public Princess() {
		super();
	}
	
	// 3 param constructor
	public Princess(String playerName, int maxFatigue, int maxSteps) {
		super(playerName, maxFatigue, maxSteps);
	}
	
	// methods to generate responses for stepping on specific tiles
	public void stepsInMud() {
		System.out.println("This mud is going to stain my dress!");
	}
	public void stepsOnGrass() {
		System.out.println("This grass feels great between my toes.");
	}
	public void stepsOnRoad() {
		System.out.println("This road is dusty.");
	}
	public void stepsOnTrap() {
		System.out.println("This trap won't affect me!");
	}
}
