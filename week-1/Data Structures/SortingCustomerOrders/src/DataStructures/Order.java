package DataStructures;

public class Order {
	private String OrderId;
	private String customerName;
	private double totalPrice;
	
	public String getOrderId() {
		return this.OrderId;
	}
	public String getCustomerName() {
		return this.customerName;
	}
	
	public double getTotalPrice() {
		return this.totalPrice;
	}
	
	public Order(String OrderId, String name, double price) {
		this.customerName = name;
		this.OrderId = OrderId;
		this.totalPrice = price;
	}
}
