package Test4;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 18) {
        	System.out.println("Minor");
        } else if (age >= 60) {
        		System.out.println("Senior");
        	} else {
        	System.out.println("Adult");
        }
        scanner.close();  
      }
}