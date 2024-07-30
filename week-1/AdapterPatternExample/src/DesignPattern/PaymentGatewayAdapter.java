package DesignPattern;

public class PaymentGatewayAdapter implements PaymentProcessor {
	
	private PaymentGateway paymentGateway;
	
	public PaymentGatewayAdapter(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}
	
	@Override
	public void processPayment(double amount) {
		paymentGateway.GateOpen(amount);
	}
	
	@Override
	public void cancelPayment() {
		paymentGateway.GateClose();
	}
}
