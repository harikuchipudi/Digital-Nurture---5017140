package DesignPattern;

public class PaymentContext {
	private PaymentStrategy paymentStrategy;
	
	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
	
	 public void Pay(double amount) {
		 paymentStrategy.Pay(amount);
	}
}
