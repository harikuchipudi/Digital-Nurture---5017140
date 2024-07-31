package DataStructures;
import java.util.*;

public class Inventory {
	private Map<String, Product> products;
	
	public Inventory() {
        this.products = new HashMap<>();
    }
	
	public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            System.out.println("Product with this ID already exists.");
        } else {
            products.put(product.getProductId(), product);
            System.out.println("Product added successfully.");
        }
    }
	
	public void updateProduct(Product product) {
	        if (products.containsKey(product.getProductId())) {
	            products.put(product.getProductId(), product);
	            System.out.println("Product updated successfully.");
	        } else {
	            System.out.println("Product with this ID does not exist.");
	        }
	    }
	
	public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product with this ID does not exist.");
        }
    }

    // Display all products
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in the inventory.");
        } else {
            for (Product product : products.values()) {
                System.out.println(product);
            }
        }
    }
    
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding products
        Product product1 = new Product("101", "Laptop", 10, 800.00);
        Product product2 = new Product("102", "Smartphone", 15, 500.00);
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Display products
        inventory.displayProducts();

        // Updating a product
        Product product1Updated = new Product("101", "Gaming Laptop", 8, 1200.00);
        inventory.updateProduct(product1Updated);

        // Display products after update
        inventory.displayProducts();

        // Deleting a product
        inventory.deleteProduct("002");

        // Display products after deletion
        inventory.displayProducts();
    }

}
