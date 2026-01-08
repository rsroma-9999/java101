package Act1;

public class MyApp {

	public static void main(String[] args) {
		
		BankAccount bankacc = new BankAccount();
		// Print a header message
        System.out.println("=== Bank Account Name Display ===");
 
        // Test a valid account
        bankacc.testCase("ACC-001");
 
        // Test an invalid account (triggers exception)
        bankacc.testCase("ACC-999");
 
        // Print a completion message
        System.out.println();
        System.out.println("=== Program Completed successfully! ===");
    }

}
