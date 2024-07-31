package DesignPattern;

import java.util.*;

public class StockMarket implements Stock{
	private List<Observer> observers;
	private String stockName;
	private double stockPrice;
	
	public StockMarket() {
		observers = new ArrayList<>();
		
	}
	
	
	public void setStockPrice(String stockName, double stockPrice) {
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		notifyObservers();
	}
	
	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}
	
	@Override
	public void deregister(Observer observer) {
		observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(stockName, stockPrice);
		}
	}
	
}
