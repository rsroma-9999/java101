package Act3;

import java.text.DecimalFormat;

public class ATMTransaction {
	
	public static void checkBalance(String accountNumber,double balance) {
		
		System.out.println("Processing balance inquiry...");
		
		try {
			int accountNo = Integer.parseInt(accountNumber);
			DecimalFormat dec2 = new DecimalFormat("0.00"); // decimal format x.xx
			
	//		System.out.println("Processing balance inquiry...");
        
            // Check account type
            char accountType = accountNumber.charAt(0);
            
            if (accountType == '1') {
                System.out.println("Account Type: Savings");
                
            }    
            else if (accountType == '2') {
                System.out.println("Account Type: Checking");
                       
            } else {
                System.out.println("Account Type: Unknown");
                
            }
            
            System.out.println("Account Number: " + accountNo);
            System.out.println("Current Balance: ₱" + dec2.format(balance));
            System.out.println("Balance inquiry successful!");
 
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid account number format! Account numbers must be numeric.");
            
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Account number is empty or invalid!");
            
        } finally {
            System.out.println("\n========== RECEIPT ==========");
            System.out.println("Transaction Date: December 3, 2025");
            System.out.println("Transaction Type: Balance Inquiry");
            System.out.println("ATM Location: Main Branch");
            System.out.println("Thank you for banking with us!");
            System.out.println("==============================\n");
            
        }
       
   	}
	
}
