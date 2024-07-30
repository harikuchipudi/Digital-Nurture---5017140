package DesignPattern;

public class SafePay {
	public void SafePayment(double amount) {
		System.out.println("The Amount"+ amount +"has been Paid through the SafePayment Gateway");
	}
	
	public void UnSafePayment() {
		System.out.println("The payment is failed at the SafePay Gateway");
	}
}
