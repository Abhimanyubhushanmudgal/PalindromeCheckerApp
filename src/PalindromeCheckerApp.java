
import java.util.Scanner;

public class PalindromeCheckerApp {


    static void showWelcomeMessage() {
        System.out.println("=================================");
        System.out.println("   Welcome to Palindrome Checker ");
        System.out.println("=================================");
    }
    static void checkHardcodedPalindrome() {
        String word = "MADAM";
        boolean isPalindrome = true;

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }




    public static void main(String[] args) {

        // UC1
        showWelcomeMessage();

        // UC2
        checkHardcodedPalindrome();

    }
}
