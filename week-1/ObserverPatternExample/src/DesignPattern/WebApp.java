package DesignPattern;

public class WebApp implements Observer {
	private String WebAppName;
	
	public WebApp(String webName) {
		this.WebAppName = webName;
	}
	
	@Override
	public void update(String stockName, double stockPrice) {
		 System.out.println( WebAppName + " received update: " + stockName + " is now $" + stockPrice);
		 
	}
}
