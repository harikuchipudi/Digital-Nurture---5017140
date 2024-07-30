package DesignPattern;

public class CreditCardPayment implements PaymentStrategy {
	private String cardNumber;
	private String cardHolderName;
    private String cvv;
    private String expiryDate;
    
    public CreditCardPayment(String cardNumber, String cardHolderName, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }
	
	@Override
	public void Pay( double amount) {
		System.out.println("Payment through Credit Card: "+amount);
	}
}
