package recursion;

public class RecursionOne {
	public static void run(int x) {
		System.out.println(x);
		run(x+1);
	}
	public static void main(String args[]) {
		run(1);
	}
}
