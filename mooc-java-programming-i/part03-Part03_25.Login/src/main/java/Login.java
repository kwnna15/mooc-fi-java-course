
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String userName = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (isValidLogin(userName, password)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
    
    private static boolean isValidLogin(String userName, String password) {
        if (userName.equals("alex") && password.equals("sunshine")) {
            return true;
        } else if (userName.equals("emma") && password.equals("haskell")) {
            return true;
        }
        return false;
    }
}
