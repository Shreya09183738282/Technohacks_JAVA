import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("To-Do List Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String newItem = scanner.nextLine();
                    toDoList.add(newItem);
                    System.out.println("Item added to the list.\n");
                    break;
                case 2:
                    if (toDoList.isEmpty()) {
                        System.out.println("The list is empty.\n");
                    } else {
                        System.out.print("Enter the index of the item to remove: ");
                        int indexToRemove = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        if (indexToRemove >= 0 && indexToRemove < toDoList.size()) {
                            String removedItem = toDoList.remove(indexToRemove);
                            System.out.println("Removed: " + removedItem + "\n");
                        } else {
                            System.out.println("Invalid index. No item removed.\n");
                        }
                    }
                    break;
                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("The list is empty.\n");
                    } else {
                        System.out.println("To-Do List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println(i + ". " + toDoList.get(i));
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.\n");
                    break;
            }
        }
    }
}
