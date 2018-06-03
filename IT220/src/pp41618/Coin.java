package pp41618;

/*
 * Shawn Potter
 * 
 */

import java.util.Random;

public class Coin {
	private boolean orientation;
	private String headsDescription;
	private String tailsDescription;
	
	public Coin (boolean orientation, String headsDescription, String tailsDescription) {
		this.orientation=orientation;
		this.headsDescription=headsDescription;
		this.tailsDescription=tailsDescription;
	}

	public boolean isorientation() {
		return orientation;
	}

	public void setorientation(boolean orientation) {
		this.orientation = orientation;
	}

	public String getHeadsDescription() {
		return headsDescription;
	}

	public void setHeadsDescription(String headsDescription) {
		this.headsDescription = headsDescription;
	}

	public String getTailsDescription() {
		return tailsDescription;
	}

	public void setTailsDescription(String tailsDescription) {
		this.tailsDescription = tailsDescription;
	}
	public void Flip() {
		orientation = new Random().nextBoolean();
	}

	@Override
	public String toString() {
		Flip();
		if(orientation) {
			return headsDescription;	
		} 
		else {
			return tailsDescription;
		}
	}
	
}
