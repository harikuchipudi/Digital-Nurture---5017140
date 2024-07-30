package DesignPattern;

public class TestObserverPattern {
	public static void main(String[] args) {
		StockMarket stockmarket = new StockMarket();
		
		Observer mobileApp = new MobileApp("MobileApplication");
		Observer webapp = new WebApp("WebApplication");
		
		stockmarket.register(webapp);
		
		stockmarket.register(mobileApp);
		
		System.out.println("");
		stockmarket.setStockPrice("AAPL", 150.00);
        stockmarket.setStockPrice("GOOGL", 2800.00);
        
        System.out.println("");
		
        stockmarket.deregister(mobileApp);
        
        stockmarket.setStockPrice("AMZN", 3300.00);
        
        stockmarket.notifyObservers();
		
	}
}
