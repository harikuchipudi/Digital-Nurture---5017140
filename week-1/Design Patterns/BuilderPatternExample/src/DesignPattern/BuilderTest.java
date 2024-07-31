package DesignPattern;

public class BuilderTest  {
	public static void main(String[] args) {
		Computer computer = new Computer.Builder("ARM-64", "8", "512").Build();
		System.out.println(computer.toString());
	}
}
