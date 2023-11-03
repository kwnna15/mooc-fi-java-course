
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalYears = 0;
        int numEntries = 0;
        String longestName = "";
        
        while (true) {
            String string = scanner.nextLine();
            if (string.isEmpty()) {
                break;
            }
            
            String[] split = string.split(",");
            totalYears += Integer.parseInt(split[1].trim());
            String name = split[0].trim();
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            
            numEntries++;
        }
        
        double averageYears = totalYears / (numEntries * 1.0);
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageYears);
    }
}
