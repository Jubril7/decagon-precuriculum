import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberType {
    public  String numberType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer followed by the Enter Key: ");

        int number = scanner.nextInt();

        try {
            if(number > 0) {
                return "Number (" + number + ") is Positive";
            } else if(number < 0) {
                return "Number (" + number + ") is Negative";
            } else {
                return "Number (" + number + ") is Zero";
            }
        } catch (InputMismatchException e) {
            return "Bad User Data";
        }
    }
}
