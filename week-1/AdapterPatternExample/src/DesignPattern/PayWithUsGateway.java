package DesignPattern;

public class PayWithUsGateway{
	public void PayWithUs(double amount) {
		System.out.println("Amount"+ amount + "has been paid through the PayWithUsGateway");
	}
	
	public void DontPayWithUs() {
		System.out.println("Payment failed at the PayWithUsGateway");
	}
}
