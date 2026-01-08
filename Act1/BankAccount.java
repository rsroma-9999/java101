package Act1;

public class BankAccount {

    public static String getAccountName(String accountNumber) {
        if ("ACC-001".equals(accountNumber)) {
            return "Juan Dela Cruz";
        } else if ("ACC-002".equals(accountNumber)) {
            return "Maria Santos";
        } else {
            return null;
        }
    }
    
 
    public static void testCase(String accountNumber) {
        System.out.println("\nLooking up account: " + accountNumber);
 
        try {
            // Call getAccountName and assign to variable name
            String name = getAccountName(accountNumber);
 
            // Convert name to uppercase 
            String upper = name.toUpperCase();
 
            // Print the uppercase name
            System.out.println("Account holder: " + upper);
 
        } catch (NullPointerException e) {
            // Catch NullPointerException
            System.out.println("Error: Account not found!");
        }
    }
 
    
}
    
