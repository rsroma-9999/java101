package act4;

public class MyApp4 {

    public static void main(String[] args) {
    	
    	AccountValidator checker = new AccountValidator();
        
    	// Test 1,2
        try {	
     		checker.validateAccount("1234567890"); 	// valid
     		checker.validateAccount("123");			// invalid short       		
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());        
            }
        
        // Test 3
        try {
     		checker.validateAccount(null);			// invalid null
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());   
            }
        
        }
    
    }

