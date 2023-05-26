import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        reverseStr();
    }
    public static void reverseStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word followed by the Enter Key: ");

        String word = scanner.nextLine().trim();
        StringBuilder newWord = new StringBuilder();

       for(int i = word.length() - 1; i >= 0; i--) {
           char leta = word.charAt(i);
           newWord.append(leta);
       }
        System.out.println(newWord.toString());
    }
}
