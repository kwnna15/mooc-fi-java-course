
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int i = 0; i < array.length; i++) {
            int numStars = 0;
            while (numStars < array[i]) {
                System.out.print("*");
                numStars++;
            }
            System.out.println("");
        }
    }
}