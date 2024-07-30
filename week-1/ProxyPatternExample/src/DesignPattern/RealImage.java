package DesignPattern;

public class RealImage implements Image {
	private String filename;
	
	public RealImage(String fileName) {
		this.filename = fileName;
		loadFromRemoteServer();
	}
	
	private void loadFromRemoteServer() {
        System.out.println("Loading " + filename + " from remote server");
        
        System.out.println(filename + " loaded from remote server.");
    }
	
	@Override
	public void display() {
		System.out.println("Displaying " + filename);
	}
}
