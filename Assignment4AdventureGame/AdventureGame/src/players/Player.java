/*
 * Shawn Potter
 * 
 * Adventure Game
 * 
 * The Player parent class sets the outline for the three child classes
 * 
 * 5/26/2018
 * Player.java
 */

package players;

public abstract class Player
{
	// variables for player class
	private String playerName;
	private int maxFatigue;
	private int currentFatigue;
	private int maxSteps;
	
	//default constructor
	public Player() {
		
	}
	
	// 3 param constructor
	public Player(String playerName, int maxFatigue, int maxSteps) {

		this.playerName = playerName;
		this.maxFatigue = maxFatigue;
		this.maxSteps = maxSteps;
	}

	
	
	// getters and setters
	public String getPlayerName() {
		return playerName;
	}



	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}



	public int getMaxFatigue() {
		return maxFatigue;
	}



	public void setMaxFatigue(int maxFatigue) {
		this.maxFatigue = maxFatigue;
	}



	public int getCurrentFatigue() {
		return currentFatigue;
	}



	public void setCurrentFatigue(int currentFatigue) {
		this.currentFatigue = currentFatigue;
	}



	public int getMaxSteps() {
		return maxSteps;
	}



	public void setMaxSteps(int maxSteps) {
		this.maxSteps = maxSteps;
	}


	//methods to be used in the child classes
	public abstract void stepsInMud();
	public abstract void stepsOnGrass();
	public abstract void stepsOnRoad();
	public abstract void stepsOnTrap();
}
