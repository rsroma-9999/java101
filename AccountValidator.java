package act4;

public class AccountValidator {
	
     public void validateAccount(String accountNumber) throws Exception {  	 
    	
    	// check null 
         if (accountNumber == null) {
             throw new NullPointerException("Cannot be null");
             
         } 
    	 
        // check length if 10
        if (accountNumber.length() != 10) {
            throw new Exception("Must be 10 digits");
            
        } else {  
          System.out.println("Valid account: " + accountNumber);
        
        }
     
    }

}
