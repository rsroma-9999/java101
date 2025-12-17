package Act3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.text.DecimalFormat;

public class MyApp3 {

	public static void main(String[] args) {
			
 
		// Create a Map of products with 5 initial records
		Map<String, Double> products = new HashMap<>();
		   products.put("Laptop", 50000.00);
		   products.put("Mouse", 999.99);  
		   products.put("Keyboard", 2499.00);
		   products.put("Monitor", 10000.00);
		   products.put("Printer", 5000.75);
	  
		   DecimalFormat dec2 = new DecimalFormat("0.00"); // decimal format x.xx

 /*		// Iterate through the HashMap
		        System.out.println("All scores:");
		        for (Map.Entry<String, Double> productEntry : products.entrySet()) {
		            System.out.println(productEntry.getKey());
		            System.out.println(dec2.format(productEntry.getValue()));
		        }
 */		        
// /*
	   Scanner scanner = new Scanner(System.in);
	   int options;
		        
	   do {
	     System.out.println("Select an option:");
		 System.out.println("1. Search a product");
		 System.out.println("2. Add a product");
		 System.out.println("3. Print all products and prices");
		 System.out.println("4. Find the cheapest products");
		 System.out.println("5. Exit");
		 System.out.print("> ");
		 options = scanner.nextInt();
		 scanner.nextLine(); 
		  
			
		 
		// Option 1
         if (options == 1) {
                 System.out.print("Enter a product to search: ");
                 String searchProduct = scanner.nextLine();
                                  
                 if (products.containsKey(searchProduct)) {
                     System.out.println("Product found! Price : $ " + dec2.format(products.get(searchProduct)));
                 } else {
                     System.out.println(searchProduct + " item not found!");
                 }
                 System.out.println();
      
             // Option 2            
         } else if (options == 2) { 

                 System.out.print("Enter a product to add: ");
                 String newProduct = scanner.nextLine();
                 if (products.containsKey(newProduct)) {
                	 
                	 System.out.println(newProduct + " item already exists.");
                                               
                 } else {
                	 System.out.println("Enter product price: ");
                	 double newValue = scanner.nextDouble();
                	 products.put(newProduct, newValue); 
                     System.out.println(newProduct + " item added.");    
                 }
                 System.out.println();     
                
        // Option 3 
         } else if (options == 3) {    
        	 System.out.println(); 
                 System.out.println("Products price list: ");
                 for (Map.Entry<String, Double> productEntry : products.entrySet()) {
 		            System.out.println(productEntry.getKey() + " " + dec2.format(productEntry.getValue()));
 		           		            
 		        } 	
                 System.out.println("Total products: " + products.size()); 	
                 System.out.println(); 
                 
              // Option 4 
         } else if (options == 4) {    
        	 System.out.println(); 
        	 String minKey = null;
        	 Double minValue = Double.MAX_VALUE;
              
        	 for (Map.Entry<String, Double> productEntry : products.entrySet()) {
                if (productEntry.getValue() < minValue) {
                   minValue = productEntry.getValue();
                   minKey = productEntry.getKey();
                }
           		            
 		    } 	
                 System.out.println("Cheapest product: " + minKey + " " + dec2.format(minValue));          
                 System.out.println(); 
                 
		// Invalid Option		
         } else if (options > 5) {        
         	
         System.out.println("*Invalid option! Please retry.");
         System.out.println(); 
         	 
         }
	 
	  } while (options != 5);

		System.out.println();
		System.out.println("Exit program.");
		scanner.close();
			
	}

}
