
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int number2 = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = number; i <= number2; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);

    }
}
