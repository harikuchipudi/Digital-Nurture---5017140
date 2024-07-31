package DesignPattern;

public class TestCommandPattern {
	public static void main(String[] args) {
		Light livingroomLight = new Light();
		
		Command lighOn = new LightOnCommand(livingroomLight);
		Command lightOff = new LightOffCommand(livingroomLight);
		
		RemoteControl remote = new RemoteControl();
		
		remote.setCommand(lighOn);
		remote.pressButton();
		
		remote.setCommand(lightOff);
		remote.pressButton();
		
		
	}

}
