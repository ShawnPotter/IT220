package recursion;

public class RecursionTwo {
	public static void run(int x) {
		System.out.println(x);
		if(x<5)
			run(x+1);
		
	}
	public static void main(String args[]) {
		run(1);
	}
}
