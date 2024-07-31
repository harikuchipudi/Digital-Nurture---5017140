package DesignPattern;

public class TestStrategyPattern {
	public static void main(String[] args) {
		PaymentContext context = new PaymentContext();
		
		 PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe", "123", "12/23");
	     context.setPaymentStrategy(creditCardPayment);
	     context.Pay(100.0);
	     
	     PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "password");
	     context.setPaymentStrategy(payPalPayment);
	     context.Pay(200.0);
		
	}
}
