package DesignPattern;

public class ExcelDocument implements Document{
	@Override
	public void open() {
		System.out.println("The Excel Document is Opening...");
	}
	
	@Override
	public void close() {
		System.out.println("The Excel Document is Closing....");
	}
	
	public static void main(String[] args) {
		ExcelDocument excel = new ExcelDocument();
		excel.open();
		excel.close();
	}
}
