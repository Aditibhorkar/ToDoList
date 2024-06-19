package ToDoList;

import java.util.Scanner;

public class ToDoListDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ToDoList toDoList = new ToDoList();

		while (true) {
			System.out.println("******************************************************************************\nTo-Do List Application");
			System.out.println("1. Add a task");
			System.out.println("2. Complete a task");
			System.out.println("3. Display all tasks");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // consume the newline

			switch (choice) {
			case 1:
				System.out.print("Enter task description: ");
				String description = scanner.nextLine();
				toDoList.addTask(description);
				break;
			case 2:
				System.out.print("Enter task number to mark as completed: ");
				int taskNumber = scanner.nextInt();
				toDoList.completeTask(taskNumber - 1);
				break;
			case 3:
				toDoList.displayTasks();
				break;
			case 4:
				System.out.println("Exiting...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
