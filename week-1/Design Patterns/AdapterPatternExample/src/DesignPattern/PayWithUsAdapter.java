package DesignPattern;

public class PayWithUsAdapter implements PaymentProcessor {
	private PayWithUsGateway payWithUs;
	
	public PayWithUsAdapter(PayWithUsGateway payWithUs) {
		this.payWithUs = payWithUs;
	}
	
	@Override
	public void processPayment(double amount) {
		payWithUs.PayWithUs(amount);
	}
	
	@Override
	public void cancelPayment() {
		payWithUs.DontPayWithUs();
	}
}
