package DesignPattern;

public class SMSNotifierDecorator extends NotifierDecorator {
	
	public SMSNotifierDecorator(Notifier wrapped) {
		super(wrapped);
	}
	
	@Override
	public void send(String message) {
		super.send(message);
		SMS(message);
	}
	
	public void SMS(String message) {
		System.out.println("Sending SMS with the message:"+message);
	}
	
}
