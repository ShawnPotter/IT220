package complexity;
/**
 * This class contains a main method that can be used to time summing up numbers 
 * @author susan
 *
 */
public class Runtime {
/**
 * 
 * @param args is not used
 */
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		for(int k=1; k<arr.length; k=k*2)
		    System.out.println(arr[k]);

		long startTime = System.nanoTime();

		// algorithm runtime
		int sum = 0;
		int n = 4000;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		long endTime = System.nanoTime();

		System.out.println("Runtime (ns): " + (endTime - startTime));

	}

}