package act8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {

    private static Logger logger = LoggerFactory.getLogger(BankAccount.class);
    private double balance = 10000.00;

    public double getBalance() { return balance; }

    // withdrawal    
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        logger.info("Withdrawal requested: {}", peso(amount));
        
        // check if < 0
        if (amount < 0) {
            logger.error("Invalid withdrawal amount: {}", peso(amount));
            throw new InvalidAmountException("Withdrawal amount must be greater than 0");
        }
        
        // check if > balace
        if (amount > balance) {
            logger.warn("Insufficient funds: {} available", peso(balance));
            throw new InsufficientFundsException("Insufficient funds for withdrawal", balance, amount);
        }
        balance -= amount;
        logger.info("Withdrawal completed: {}, New balance: {}", peso(amount), peso(balance));
    }

    // deposit
    public void deposit(double amount) throws InvalidAmountException {
        logger.info("Deposit requested: {}", peso(amount));
        
        // check if < 0
        if (amount <= 0) {
            logger.error("Invalid deposit amount: {}", peso(amount));
            throw new InvalidAmountException("Deposit amount must be positive");
        }
        
        // check if > 50K
        if (amount > 50000) {
            logger.warn("Large deposit: {} - requires verification", peso(amount));
        }
        balance += amount;
        logger.info("Deposit completed: {}, New balance: {}", peso(amount), peso(balance));
    }

    // peso
    static String peso(double amount) {
        return "₱" + amount;
    }
    
    // runTest
    public static void runTest(BankTestOperation operation, String operationName) {
    	
        try {
            operation.execute();
            
        } catch (InvalidAmountException e) {
            logger.error("{} failed: {}", operationName, e.getMessage(), e);
            
        } catch (InsufficientFundsException e) {
            logger.error("{} failed: {}", operationName, e.getMessage(), e);
                      
        }
    }
    
    // main
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        runTest(() -> account.deposit(5000), "Deposit");
        runTest(() -> account.withdraw(3000), "Withdrawal");
        runTest(() -> account.deposit(-500), "Deposit");
        runTest(() -> account.withdraw(20000), "Withdrawal");
        runTest(() -> account.deposit(60000), "Deposit");
   //   runTest(() -> account.withdraw(-1), "Withdrawal");
	}
    
}
