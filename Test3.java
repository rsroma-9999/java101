package Test03;
import java.util.Scanner;
public class Test3 {

	public static int computesum(int a, int b) {
		return a + b; // +
	    }
		public static int computediff(int a, int b) {
        return a - b; // -
	    }
	    // Method to compute product
	    public static int computeprod(int a, int b) {
	    return a * b; // *
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	    // Ask the user for 2 integers
	        System.out.print("Enter 1st integer: ");
	        int no1 = scanner.nextInt();

	        System.out.print("Enter 2nd integer: ");
	        int no2 = scanner.nextInt();
	 
	        // Compute results using methods
	        int sum = computesum(no1, no2);
	        int diff = computediff(no1, no2);
	        int prod = computeprod(no1, no2);
	 
	        System.out.println("\nSum: " + sum);
	        System.out.println("Difference: " + diff);
	        System.out.println("Product: " + prod);
	 
	        scanner.close();
	}

}
