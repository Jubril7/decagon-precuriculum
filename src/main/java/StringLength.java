import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        stringLength();
    }

    public static void stringLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word followed by the Enter Key: ");

        String word = scanner.nextLine();
        int wordLength = word.trim().length();

        System.out.println("The length of the word is " + wordLength);
        System.out.println(word);

    }
}
