package DesignPattern;

public class PdfDocument implements Document {
	@Override
	public void open() {
		System.out.println("Opening the pdf document");
	}
	
	@Override
	public void close() {
		System.out.println("Closing the Pdf Document");
	}
	
	public static void main(String[] args) {
		PdfDocument pdf = new PdfDocument();
		pdf.open();
		pdf.close();
	}
}
