package DesignPattern;


public class Logger {
	private static final Logger loggerInstance = new Logger();
	
	private Logger() {
		System.out.println("This is the object of the Logger class");
	}
	public static Logger getInstance() {
		return loggerInstance;
	}
	public void Log(String message) {
		System.out.println(message);
	}
	public static void main(String[] args) {
		Logger ins1 = Logger.getInstance();
		Logger ins2 = Logger.getInstance();
		
		System.out.println("Instance 1 hash:" + ins1.hashCode());
	    System.out.println("Instance 2 hash:" + ins2.hashCode());
	    
	    if (ins1 == ins2) {
            System.out.println("Both instances are the same");
        } else {
            System.out.println("Instances are different");
        }
	    ins1.Log("This is the message");
	}
}
