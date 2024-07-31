package DataStructures;

public class EmployeeForum {
	private Employee[] employees;
	private int count;
	
	public EmployeeForum(int size) {
		employees = new Employee[size];
		count = 0;
	}
	
	public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }
	
	public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }
	
	public void traverseEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(employees[i]);
            }
        }
    }
	
	public void deleteEmployee(String employeeId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[count - 1] = null;
            count--;
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
	
	public static void main(String[] args) {
        EmployeeForum management = new EmployeeForum(5);

        Employee emp1 = new Employee("E001", "Alice", "Manager", 70000);
        Employee emp2 = new Employee("E002", "Bob", "Developer", 50000);
        Employee emp3 = new Employee("E003", "Charlie", "Analyst", 60000);

        management.addEmployee(emp1);
        management.addEmployee(emp2);
        management.addEmployee(emp3);

        System.out.println("Employees after adding:");
        management.traverseEmployees();

        System.out.println("\nSearching for employee E002:");
        Employee foundEmployee = management.searchEmployee("E002");
        System.out.println(foundEmployee != null ? foundEmployee : "Employee not found");

        System.out.println("\nDeleting employee E002:");
        management.deleteEmployee("E002");

        System.out.println("Employees after deletion:");
        management.traverseEmployees();
    }
}

