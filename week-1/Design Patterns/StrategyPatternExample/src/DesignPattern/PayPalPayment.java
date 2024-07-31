package DesignPattern;

public class PayPalPayment implements PaymentStrategy {
	
	private String email;
    private String password;
    
    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    
	@Override
	public void Pay(double amount) {
		System.out.println("Payment through PayPal:"+amount);
	}
}
