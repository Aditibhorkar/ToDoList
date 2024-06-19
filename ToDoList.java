package ToDoList;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	private List<Task> tasks;

	public ToDoList() {
		tasks = new ArrayList<>();
	}

	public void addTask(String description) {
		tasks.add(new Task(description));
	}

	public void completeTask(int index) {
		if (index >= 0 && index < tasks.size()) {
			tasks.get(index).markAsCompleted();
		} else {
			System.out.println("Invalid task number.");
		}
	}

	public void displayTasks() {
		if (tasks.isEmpty()) {
			System.out.println("No tasks in the list.");
		} else {
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println(i + 1 + ". " + tasks.get(i));
			}
		}
	}
}
