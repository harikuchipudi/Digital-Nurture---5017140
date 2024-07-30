package DesignPattern;

public class EmailNotifier implements Notifier{
	
	@Override
	public void send(String message) {
		System.out.println("Sending the email with the message: "+ message);
	}
}
