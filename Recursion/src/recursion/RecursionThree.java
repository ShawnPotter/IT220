package recursion;

public class RecursionThree {
	public static void run(int x) {
		if(x<5)
			run(x+1);
		System.out.println(x);
	}
	public static void main(String args[]) {
		run(1);
	}
}
