
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        Scanner scan = new Scanner(System.in);
        BirdRegister birdRegister = new BirdRegister();

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            
            switch (command) {
                case "Add":
                   {
                        System.out.print("Name: ");
                        String name = scan.nextLine();
                        System.out.print("Name in Latin: ");
                        String latinName = scan.nextLine();
                        Bird newBird = new Bird(name, latinName);
                        birdRegister.add(newBird);
                        break;
                    }
                case "Observation":
                    {
                        System.out.print("Bird? ");
                        String name = scan.nextLine();
                        birdRegister.addObservation(name);
                        break;
                    }
                case "All":
                    birdRegister.printAll();
                    break;
                case "One":
                    {
                        System.out.print("Bird? ");
                        String name = scan.nextLine();
                        birdRegister.printOne(name);
                        break;
                    }
                case "Quit":
                    return;
                default:
                    break;
            }
        }
    }

}
