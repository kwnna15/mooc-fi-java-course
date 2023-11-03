
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] split = line.split(",");
                String name = split[0];
                int age = Integer.valueOf(split[1]);
                
                String yearSuffix;
                if (age > 1 || age <= 0) {
                    yearSuffix = " years";
                } else {
                    yearSuffix = " year";
                }

                System.out.println(name + ", " + "age: " + age + yearSuffix);
            }
        } catch (Exception e) {
            System.out.println("Failed reading file");
        }
    }
}
