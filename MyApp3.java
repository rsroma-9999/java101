package Act3;

public class MyApp3 {

	public static void main(String[] args) {
		
		ATMTransaction atm = new ATMTransaction();
        
		System.out.println("=== ATM BALANCE INQUIRY SYSTEM ===");
		System.out.println();
		
		// Test 1
		System.out.println("--- Test Case 1: Valid Savings Account ---"); 
		atm.checkBalance("100123456", 15000.00);
			
		// Test 2
		System.out.println("--- Test Case 2: Valid Checking Account ---"); 
		atm.checkBalance("200987654", 25000.00);
		
		// Test 3
		System.out.println("--- Test Case 3: Invalid Account Number Format ---");
		atm.checkBalance("ABC12345", 15000.00);
		
		// Test 4
		System.out.println("--- Test Case 4: Empty Account Number ---"); 
		atm.checkBalance("", 15000.00);
		
	}

}
