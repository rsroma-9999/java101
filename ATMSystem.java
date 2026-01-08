package Act2;

import java.text.DecimalFormat;

public class ATMSystem {

	private static double[] accounts = {10000,15000,20000};
	
	public static void processWithdrawal(String accountIndex,String amountInput) {
		
		try {
			int accIndex = Integer.parseInt(accountIndex);
			double balance = accounts[accIndex];
			double amount = Double.parseDouble(amountInput);
			DecimalFormat dec2 = new DecimalFormat("0.00"); // decimal format x.xx
			
			// Details
            System.out.println("Account=" + accountIndex + ", Amount=" + amount);
            System.out.println("Current balance: P" + dec2.format(balance));
            System.out.println("Withdrawal: P" + dec2.format(amount));
 
            // Check balance
            if (amount > balance) {
                System.out.println("Insufficient funds! Cannot withdraw " + dec2.format(amount));
            } else {
                double newBalance = balance - amount;
                accounts[accIndex] = newBalance;
                System.out.println("New balance: P" + dec2.format(amount));
                System.out.println("Withdrawal successful!");
            }
 
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input!");
            System.out.println("Please enter valid numbers.");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Account not found!");
            System.out.println("Invalid account index.");
            
        } catch (Exception e) {
            System.out.println("Transaction failed");
            
        }
        System.out.println();
    
	}
	
}
