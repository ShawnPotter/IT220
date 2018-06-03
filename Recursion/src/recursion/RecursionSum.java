package recursion;

public class RecursionSum {
	public static int recursiveSum(int n) {
		if(n == 1)
			return 1;
		else
			return n+recursiveSum(n-1);
	}
	public static void main(String args[]) {
		int ans = recursiveSum(5);
		System.out.println("5+4+3+2+1="+ans);
		System.out.println("Iterative Sum "+iterativeSum(5));
		
	}
	public static int iterativeSum(int n) {
		int sum = 0;
		for(int i = 1; i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
}
