package DesignPattern;

public class TestPaymentGateway {
	public static void main(String[] args) {
		System.out.println("Payment through PaymentGateway");
		//Adaptee Class
		PaymentGateway paymentGatewayInstance = new PaymentGateway();
		//Adapter Class
		PaymentGatewayAdapter paymentGatewayMain = new PaymentGatewayAdapter(paymentGatewayInstance);
		//over written methods from the interface
		paymentGatewayMain.processPayment(100.00);
		paymentGatewayMain.cancelPayment();
		
		System.out.println();
		System.out.println("Payment through SafePay Gateway");
		SafePay safePayInstance = new SafePay();
		SafePayAdapter safePaymentMain = new SafePayAdapter(safePayInstance);
		safePaymentMain.processPayment(100.00);
		safePaymentMain.cancelPayment();
		
		System.out.println();
		System.out.println("Payment through PayWithUs Gateway");
		PayWithUsGateway payWithUsInstance = new PayWithUsGateway();
		PayWithUsAdapter payWithUsMain = new PayWithUsAdapter(payWithUsInstance);
		payWithUsMain.processPayment(100.00);
		payWithUsMain.cancelPayment();
		
	}

}
