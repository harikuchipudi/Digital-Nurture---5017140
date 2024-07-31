package DesignPattern;

public class StudentController {
	private Student student;
	private StudentView view;
	
	public StudentController(Student student, StudentView view) {
		this.student = student;
		this.view = view;
	}
	
	public String getStudentName() {
        return student.getName();
    }
	
	public String getStudentId() {
		return student.getId();
	}
	
	public String getStudentGrade() {
		return student.getGrade();
	}
	
	public void updateView() {
        view.displayStudentDetails(student.getName(), student.getId(), student.getGrade());
    }

}
