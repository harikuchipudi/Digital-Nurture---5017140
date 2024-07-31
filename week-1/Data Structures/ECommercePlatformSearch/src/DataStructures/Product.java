package DataStructures;

public class Product implements Comparable<Product> {
	
	private String productId;
	private String productName;
	private String category;
	
	public Product(String productId, String productName, String category) {
		this.category = category;
		this.productId = productId;
		this.productName = productName;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public String getProductId() {
		return this.productId;
	}
	
	public String getProductCateogory() {
		return this.category;
	}
	
	public void setProductName(String name) {
		this.productName = name;
	}
	
	public void setProductId(String id) {
		this.productId = id;
	}
	
	public void setProductCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "ProductId :" + this.productId + "Product Name:" + this.productName + "Prodcut Category:"+this.category;
	}
	
	@Override
	public int compareTo(Product other) {
		return this.productId.compareTo(other.productId);
	}
}
