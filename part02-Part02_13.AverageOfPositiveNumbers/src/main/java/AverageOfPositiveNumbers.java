
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            if (number > 0) {
                sum = sum + (number);
                counter = counter + 1;
            }

        }
        if (counter > 0) {
            double average = (double) sum / counter;
            System.out.println(average);
        }
    }

}
