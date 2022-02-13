
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            int one = Integer.valueOf(scanner.nextLine());
            if (one == 0) {
                break;
            }
            if (one != 0) {
                counter = counter + 1;
            }
        }
        System.out.println("Number of numbers: " + counter);
    }
}
