
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.print(" \nLast Name: ");
            String lastName = scanner.nextLine();

            System.out.print(" \nIdentification Number: ");
            String identificationNumber = scanner.nextLine();
            System.out.println("");

            infoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber));
        }

        System.out.println("");
        for (PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}
