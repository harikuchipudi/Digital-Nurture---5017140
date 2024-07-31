package DataStructures;

public class FutureValueCalculator {
	
	public static double calculateFutureValue(double present, double rate, int terms) {
		if (terms == 0) {
            return present;
        }
        // Recursive case: calculate the future value for the next period
        return calculateFutureValue(present, rate, terms - 1) * (1 + rate);
	}
	
	public static void main(String[] args) {
		double pv = 1000.0; // Present value
        double r = 0.05; // Growth rate (5%)
        int n = 10; // Number of periods

        double futureValue = calculateFutureValue(pv, r, n);
        System.out.println("Future Value: " + futureValue);
	}

}
