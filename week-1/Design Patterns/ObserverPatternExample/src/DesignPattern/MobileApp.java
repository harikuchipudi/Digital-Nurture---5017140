package DesignPattern;

public class MobileApp implements Observer{
	private String AppName;
	
	public MobileApp(String AppName) {
		this.AppName = AppName;
	}
	
	@Override
	public void update(String stockName, double StockPrice) {
		System.out.println(AppName + " received update: " + stockName + " is now $" + StockPrice);
		
	}
}
