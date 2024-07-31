package DataStructures;

public class Employee {
	private String employeeId;
	private String name;
	private String position;
	private double salary;
	
	public Employee(String name, String id, String position, double salary) {
		this.employeeId = id;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	public String getEmployeeName() {
		return this.name;
	}
	
	public String getEmployeeId() {
		return this.employeeId;
	}
	
	public String getEmployeePosition() {
		return this.position;
	}
	
	public double getEmployeeSalary() {
		return this.salary;
	}
	
	@Override 
	public String toString() {
		return "Employee Name:" + this.name + "Employee Id:" + this.employeeId +
				"position:" + this.position + "Salary:" + this.salary;
	}
}
