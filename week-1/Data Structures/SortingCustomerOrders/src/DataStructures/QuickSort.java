package DataStructures;

public class QuickSort {
	public static void quicksort(Order[] orders, int low, int high) {
		if(low<high) {
			int pi = partition(orders, low, high);
			quicksort(orders, low, pi-1);
			quicksort(orders, high, pi+1);
		}
	}
	public static int partition(Order orders[], int low, int high) {
		double pivot = orders[high].getTotalPrice();
		int i = (low-1);
		for(int j=low; j<high; j++) {
			if(orders[j].getTotalPrice() <= pivot) {
				i++;
				
				Order temp = orders[i];
				orders[i] = orders[j];
				orders[j] = temp;
			}
		}
		
		Order temp = orders[i+1];
		orders[i+1] = orders[high];
		orders[high] = temp;
		
		return i+1;
		
	}
}
