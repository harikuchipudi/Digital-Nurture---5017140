package DesignPattern;

public class SlackNotifierDecorator extends NotifierDecorator {
	
	public SlackNotifierDecorator(Notifier wrapped) {
		super(wrapped);
	}
	
	@Override
	public void send(String message) {
		super.send(message);
		SlackMessage(message);
	}
	
	public void SlackMessage(String message) {
		System.out.println("Sending slack message with:" + message);
	}
}
