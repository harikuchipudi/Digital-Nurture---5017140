package DesignPattern;

public class PaymentGateway{
	public void GateOpen(double amount) {
		System.out.println("Amount " + amount + " has been paid through the PaymentGateway");
	}
	
	public void GateClose() {
		System.out.println("The PaymentGateway is closed");
	}
}
