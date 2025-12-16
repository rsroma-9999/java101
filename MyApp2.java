package Act2;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class MyApp2 {

	public static void main(String[] args) {

        // Step 1: Create a HashSet of products 5 initial data
        HashSet<String> products = new HashSet<>(Arrays.asList("Laptop","Mouse","Keyboard","Monitor","Printer"));
	
        // Step 2: Display the menu repeatedly until the user choose exit     	
		Scanner scanner = new Scanner(System.in);
		int options;
			
		do {
            System.out.println("Select an option:");
            System.out.println("1. Search a product");
            System.out.println("2. Add a product");
            System.out.println("3. Print all products and count");
            System.out.println("4. Exit");
            System.out.print("Select [1 - 4]: ");
            options = scanner.nextInt();
            scanner.nextLine(); 

            // Option 1
            if (options == 1) {
                    System.out.print("Enter a product to search: ");
                    String searchProduct = scanner.nextLine();
                                     
                    if (products.contains(searchProduct)) {
                        System.out.println(searchProduct + " item found.");
                    } else {
                        System.out.println(searchProduct + " item not found!");
                    }
                    System.out.println();
         
            // Option 2            
            } else if (options == 2) { 

                    System.out.print("Enter a product to add: ");
                    String newProduct = scanner.nextLine();
                    if (products.add(newProduct)) {
                        System.out.println(newProduct + " item added.");
                    } else {
                        System.out.println(newProduct + " item already exists.");
                    }
                    System.out.println();     
            
            // Option 3 
            } else if (options == 3) {    

                    System.out.println("Products list: ");
                    for (String Products : products) {
                    	System.out.println(Products);
                    }
					System.out.println("Products count: " + products.size());
					System.out.println();  
					
			// Invalid Option		
            } else if (options > 4) {        
            	
                System.out.println("*Invalid option! Please retry.");
                System.out.println(); 
            }
            
            
            // Option 4
        } while (options != 4);

		System.out.println();
		System.out.println("Exit program.");
        scanner.close();
    }
	
}