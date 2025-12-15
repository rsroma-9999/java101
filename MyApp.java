package Act1;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
		
		List<String> products = new ArrayList<>();
		
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
        System.out.println("All Products:");
        
        for (String Product : products) {
           	System.out.println(Product);
        }
		
		products.add("Webcam");
		products.remove(1);
		
		System.out.println();
		System.out.println("After Adding and Removing Products:");
		
        for (String Product : products) {
        	System.out.println(Product);
        }
		
        System.out.println();
		System.out.println("Enter product to search: ");
		
		String query = scanner.nextLine();
		int productIndex = -1;
		
		while (true) {
        
        for (int i = 0; i < products.size(); i++) {
           if (products.get(i).equalsIgnoreCase(query)) {
               productIndex = i;
           }
        }
		
           if (productIndex != -1) {
               System.out.println("Product Found: " + products.get(productIndex));
           } else {
               System.out.println("Product Not found: " + query);
           }
           
           scanner.close();    
           break;
        }
			
    }
}
