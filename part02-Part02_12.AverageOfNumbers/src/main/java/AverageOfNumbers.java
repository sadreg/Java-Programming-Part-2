
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number != 0) {
                sum = number+sum;
                counter = counter + 1;
            }
        }
        System.out.println(sum);
        System.out.println(counter);
        double average;
        average = (double)sum/(double)counter;
        System.out.println("Average of the numbers: " + average);
    }
}
