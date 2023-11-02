

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        int count = 0;
        while(count < number) {
            count++;
            System.out.println(count);
        }
    }
}
