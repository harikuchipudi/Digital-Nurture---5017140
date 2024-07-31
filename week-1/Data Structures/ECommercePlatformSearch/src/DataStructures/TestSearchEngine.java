package DataStructures;

import java.util.*;

public class TestSearchEngine {
	
	public static void main(String[] args) {
		 Product[] products = {
	                new Product("009", "Laptop", "Electronics"),
	                new Product("002", "Smartphone", "Electronics"),
	                new Product("005", "Table", "Furniture"),
	                new Product("006", "Chair", "Furniture"),
	                new Product("001", "Pen", "Stationery")
	    };
		 
		Product foundProduct = LinearSearch.linearSearch(products, "001");
        if (foundProduct != null) {
            System.out.println("Linear Search: Found " + foundProduct);
        } else {
            System.out.println("Linear Search: Product not found");
        }
        
        Arrays.sort(products);
        foundProduct = BinarySearch.binarySearch(products, "005");
        if (foundProduct != null) {
            System.out.println("Binary Search: Found " + foundProduct);
        } else {
            System.out.println("Binary Search: Product not found");
        }
	}

}
