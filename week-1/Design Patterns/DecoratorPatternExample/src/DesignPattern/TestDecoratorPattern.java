package DesignPattern;

public class TestDecoratorPattern {
	public static void main(String[] args) {
		
		Notifier emailNotifier = new EmailNotifier();
		SMSNotifierDecorator smsAndEmailNotifier = new SMSNotifierDecorator(emailNotifier);
		smsAndEmailNotifier.send("Hello Via email and sms");
		
		
		System.out.println("");
		SlackNotifierDecorator slackAndEmailNotifier = new SlackNotifierDecorator(emailNotifier);
		slackAndEmailNotifier.send("Hello Via Slack and Email");
		
		
	}
}
