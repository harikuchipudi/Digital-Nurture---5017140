package DesignPattern;

public class Computer {
	
	private final String CPU;
    private final String RAM;
    private final String storage;
    
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }
    
    public static class Builder{
    	private final String CPU;
        private final String RAM;
        private final String storage;
        
        
        public Builder(String CPU, String RAM, String storage) {
        	this.CPU = CPU;
        	this.RAM = RAM;
        	this.storage = storage;
        }
        
        public Computer Build() {
        	return new Computer(this);
        }
    }
    
    @Override
    public String toString() {
        return "Computer CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage;
    }
    
}
