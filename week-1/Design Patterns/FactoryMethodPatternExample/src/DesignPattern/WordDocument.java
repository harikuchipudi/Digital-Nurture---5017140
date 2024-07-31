package DesignPattern;
 
public class WordDocument implements Document {
	@Override
	public void open() {
		System.out.println("The Word Document is Opening...");
	}
	
	@Override
	public void close() {
		System.out.println("The Word Dcocument is closing...");
	}
	
	public static void main(String[] args) {
		WordDocument wd = new WordDocument();
		wd.open();
		
		wd.close();
	}
}
