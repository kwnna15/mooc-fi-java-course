
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kwnna
 */
public class UserInterface {

    private final TodoList todoList;
    private final Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            switch (command) {
                case "stop":
                    return;
                case "add":
                    System.out.println("To add:");
                    String addTask = scanner.nextLine();
                    todoList.add(addTask);
                    break;
                case "list":
                    todoList.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    int removed = Integer.valueOf(scanner.nextLine());
                    todoList.remove(removed);
                    break;
                default:
                    // continue
            }
        }
    }
}
