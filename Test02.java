package Test02;
import java.util.Scanner;
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String age = scanner.nextLine();
        int ageint = Integer.parseInt(age);
        Double agedouble = (double) ageint;
        System.out.println("Your age in int: " + ageint);
        System.out.println("Your age in double: " + agedouble);
        scanner.close();
	}

}