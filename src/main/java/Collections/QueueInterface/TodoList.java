package Collections.QueueInterface;

import java.util.*;

public class TodoList {
  // Define a priority queue to store tasks with their priorities
  private Queue<Task> toDoList;

  public TodoList() {
    // Initialize the priority queue, specifying a custom comparator to order tasks
    // by priority
    toDoList = new PriorityQueue<>(Comparator.comparingInt(Task::getPriority).reversed());
  }

  public static void main(String[] args) {
    // Create an instance of TodoList
    TodoList todoList = new TodoList();
    // Create a Scanner to read user input
    Scanner scanner = new Scanner(System.in);

    // Create a loop to interact with the user until they choose to exit
    boolean running = true;
    while (running) {
      // Display menu options
      System.out.println("Choose an option:");
      System.out.println("1. Add task");
      System.out.println("2. Mark task as completed");
      System.out.println("3. View tasks");
      System.out.println("4. Exit");

      int choice = Integer.parseInt(scanner.nextLine());

      switch (choice) {
        case 1:
          // Prompt the user for task description and priority
          System.out.println("Enter task description: ");
          // Read the entire line as the task description
          String description = scanner.nextLine();

          System.out.println("Enter task priority (1-5): ");
          // Read the entire line as the task priority
          int priority = Integer.parseInt(scanner.nextLine());

          // Add the task to the todoList
          todoList.addTask(new Task(description, priority));
          break;

        case 2:
          // Mark the task as completed
          todoList.completeTask();
          break;
        case 3:
          // View the tasks in the list
          todoList.viewTasks();
          break;
        case 4:
          // Exit the loop
          running = false;
          break;
        default:
          // Handle invalid input
          System.out.println("Invalid choice.");
      }
    }

    // Close the scanner
    scanner.close();
    // Display a goodbye message
    System.out.println("Goodbye!");
  }

  private void addTask(Task task) {
    // Add the task to the priority queue
    toDoList.add(task);
  }

  private void completeTask() {
    // Remove the highest-priority task from the priority queue
    Task completedTask = toDoList.poll();
    if (completedTask != null) {
      System.out.println("Completed: " + completedTask.getDescription());
    } else {
      System.out.println("No tasks to complete.");
    }
  }

  private void viewTasks() {
    // Check if the priority queue is empty
    if (toDoList.isEmpty()) {
      System.out.println("No tasks in the list.");
    } else {
      // Iterate through tasks and display their descriptions and priorities
      for (Task task : toDoList) {
        System.out.println("Task: " + task.getDescription() + " (Priority: " + task.getPriority() + ")");
      }
    }
  }

  // Inner class to represent a task with description and priority
  private static class Task {
    private String description;
    private int priority;

    // Constructor to create a task with description and priority
    public Task(String description, int priority) {
      this.description = description;
      this.priority = priority;
    }

    // Getter for task description
    public String getDescription() {
      return description;
    }

    // Getter for task priority
    public int getPriority() {
      return priority;
    }
  }
}
