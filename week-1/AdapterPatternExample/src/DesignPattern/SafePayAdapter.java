package DesignPattern;

public class SafePayAdapter implements PaymentProcessor {
	private SafePay safePay;
	
	public SafePayAdapter(SafePay safePay) {
		this.safePay = safePay;
	}
	
	@Override
	public void processPayment(double amount) {
		safePay.SafePayment(amount);
	}
	
	@Override
	public void cancelPayment() {
		safePay.UnSafePayment();
	}
}
