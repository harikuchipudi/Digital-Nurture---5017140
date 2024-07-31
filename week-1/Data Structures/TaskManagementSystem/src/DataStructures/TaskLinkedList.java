package DataStructures;

public class TaskLinkedList {
	private Node head;
	
	private static class Node{
		Task task;
		Node next;
		
		Node(Task task){
			this.task = task;
			this.next = null;
		}
	}
	
	public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Task added successfully.");
    }
	
	 public Task searchTask(String taskId) {
	        Node current = head;
	        while (current != null) {
	            if (current.task.getTaskId().equals(taskId)) {
	                return current.task;
	            }
	            current = current.next;
	        }
	        return null;
	    }
	 
	 public void traverseTasks() {
	        if (head == null) {
	            System.out.println("No tasks to display.");
	        } else {
	            Node current = head;
	            while (current != null) {
	                System.out.println(current.task);
	                current = current.next;
	            }
	        }
	    }
	 
	 public void deleteTask(String taskId) {
	        if (head == null) {
	            System.out.println("Task not found.");
	            return;
	        }

	        if (head.task.getTaskId().equals(taskId)) {
	            head = head.next;
	            System.out.println("Task deleted successfully.");
	            return;
	        }

	        Node current = head;
	        while (current.next != null && !current.next.task.getTaskId().equals(taskId)) {
	            current = current.next;
	        }

	        if (current.next == null) {
	            System.out.println("Task not found.");
	        } else {
	            current.next = current.next.next;
	            System.out.println("Task deleted successfully.");
	        }
	    }
	 
	 public static void main(String[] args) {
	        TaskLinkedList taskList = new TaskLinkedList();

	        Task task1 = new Task("T001", "study for cae", "In Progress");
	        Task task2 = new Task("T002", "complete cognizant assignment", "Completed");
	        Task task3 = new Task("T003", "Edit the video", "Not Started");

	        taskList.addTask(task1);
	        taskList.addTask(task2);
	        taskList.addTask(task3);

	        System.out.println("Tasks after adding:");
	        taskList.traverseTasks();

	        System.out.println("\nSearching for task T002:");
	        Task foundTask = taskList.searchTask("T002");
	        System.out.println(foundTask != null ? foundTask : "Task not found");

	        System.out.println("\nDeleting task T002:");
	        taskList.deleteTask("T002");

	        System.out.println("Tasks after deletion:");
	        taskList.traverseTasks();
	    }
	
	

}
