package pp41618;

public class CoinTest {

	public static void main(String[] args) {
		Coin penny = new Coin(false, "You see Abraham Lincoln", "You see the Union Shield");
		Coin nickel = new Coin(false, "You see Thomas Jefferson", "You see Montecello");
		Coin dime = new Coin(false, "You see Franklin D. Roosevelt", "You see a Oak and Olive Branch with a Torch");
		Coin quarter = new Coin(false, "You see George Washington", "You see an Eagle");
		
		//penny.Flip();
		System.out.println("You flipped a penny: "+penny);
		//nickel.Flip();
		System.out.println("\nYou flipped a nickel: "+nickel);
		//dime.Flip();
		System.out.println("\nYou flipped a dime: "+dime);
		//quarter.Flip();
		System.out.println("\nYou flipped a quarter: "+quarter);
	}

}
