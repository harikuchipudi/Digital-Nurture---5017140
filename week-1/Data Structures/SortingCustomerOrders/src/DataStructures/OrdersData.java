package DataStructures;
import java.util.*;
import java.io.*;

public class OrdersData {
	public static void main(String[] args) {
		Order[] orders = {
	            new Order("O001", "Alice", 250.0),
	            new Order("O002", "Bob", 150.0),
	            new Order("O003", "Charlie", 200.0),
	            new Order("O004", "David", 300.0),
	            new Order("O005", "Eve", 100.0)
	        };
		
		System.out.println("Orders before Bubble Sort:");
		for(int i=0; i<orders.length; i++) {
			System.out.println(orders[i].getTotalPrice());
		}
		
		BubbleSort.bubbleSort(orders);
		System.out.println("Orders After Bubble Sort:");
		for(int i=0; i<orders.length; i++) {
			System.out.println(orders[i].getTotalPrice());
		}
		
		Order[] ordersforquicksort = {
				new Order("O001", "Alice", 250.0),
	            new Order("O002", "Bob", 150.0),
	            new Order("O003", "Charlie", 200.0),
	            new Order("O004", "David", 300.0),
	            new Order("O005", "Eve", 100.0)
		};
		
		
		System.out.println("Before quick sort");
		for(int i=0; i<ordersforquicksort.length; i++) {
			System.out.println(ordersforquicksort[i].getTotalPrice());
		}
		
		
		QuickSort.quicksort(ordersforquicksort, 0, ordersforquicksort.length-1);
		System.out.println("After the quick sort");
		for(int i=0; i<ordersforquicksort.length; i++) {
			System.out.println(ordersforquicksort[i].getTotalPrice());
		}
		
	    
	     
	}
}
