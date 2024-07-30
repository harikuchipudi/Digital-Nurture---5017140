package DesignPattern;

public class TestMVCPattern {
	
	public static void main(String[] args) {
		Student model = new Student("1", "John Doe", "A");
		
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		Student student = new Student("2","Hari Kiran", "A");
		
		StudentView studentview = new StudentView();
		
		StudentController controller1 = new StudentController(student, studentview);
		
		controller1.updateView();

		
	}

}
