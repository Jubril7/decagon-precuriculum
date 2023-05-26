import java.util.Scanner;

public class LetterType {
    public static void main(String[] args) {
        letterType();
    }
    public static void letterType() {
        Scanner scanner = new Scanner(System.in);
        boolean isLetter;

        do{
            System.out.println("Enter a Valid Letter followed by the Enter Key: ");
            String letter = scanner.nextLine().trim();

            if(letter.length() > 1 || isNumber(letter)){
                isLetter = false;
            } else {
                letter = letter.toLowerCase();
                switch (letter) {
                    case "a", "e", "i", "u", "o" -> System.out.println("Letter (" + letter + ") is vowel");
                    default -> System.out.println("Letter (" + letter + ")  is consonant");
                }
                isLetter = true;
            }
        } while(!isLetter);
    }

    public static boolean isNumber(String number) {
        try {
            int num = Integer.parseInt(number);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
}
