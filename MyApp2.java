package Act2;

import java.text.DecimalFormat;

public class MyApp2 {

	public static void main(String[] args) {

        ATMSystem atm = new ATMSystem();
                
		System.out.println("=== ATM Withdrawal System ===");
		System.out.println();
		
		// Test 1
		System.out.println("--- Test 1: Valid Withdrawal ---"); 
		atm.processWithdrawal("1","5000");
		
	
		// Test 2
		System.out.println("--- Test 2: Invalid Account Index ---"); 
		System.out.println("Account=abc, Amount=5000");
		atm.processWithdrawal("abc","5000");
		
		
		// Test 3
		System.out.println("--- Test 3: Account Not Found ---");
		System.out.println("Account=10, Amount=5000");
		atm.processWithdrawal("10","5000");
		
		
		// Test 4
		System.out.println("--- Test 4: Insufficient Funds ---"); 
		atm.processWithdrawal("1","20000");
		
		System.out.println("=== All Tests Completed! ===");

	}

}
