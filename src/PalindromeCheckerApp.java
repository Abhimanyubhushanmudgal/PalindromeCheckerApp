
import java.util.Scanner;

public class PalindromeCheckerApp {


    static void showWelcomeMessage() {
        System.out.println("=================================");
        System.out.println("   Welcome to Palindrome Checker ");
        System.out.println("=================================");
    }
    static void checkUserInputPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or number: ");
        String input = sc.nextLine();

        boolean isPalindrome = true;
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
    // UC4: Case-insensitive palindrome check
    static void checkCaseInsensitivePalindrome(String input) {
        input = input.toLowerCase();

        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Case-insensitive: Palindrome");
        } else {
            System.out.println("Case-insensitive: Not a Palindrome");
        }
    }


    // UC5: Ignore spaces and special characters
    static void checkSpecialCharPalindrome(String input) {
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Ignoring special chars: Palindrome");
        } else {
            System.out.println("Ignoring special chars: Not a Palindrome");
        }
    }
    // UC6: Numeric palindrome check
    static void checkNumericPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        if (original == reverse) {
            System.out.println("Numeric palindrome");
        } else {
            System.out.println("Not a numeric palindrome");
        }
    }



    public static void main(String[] args) {

        // UC1
        showWelcomeMessage();

        // UC3
        checkUserInputPalindrome();

        checkCaseInsensitivePalindrome("MadAm");
        checkSpecialCharPalindrome("A man, a plan, a canal: Panama");

        checkNumericPalindrome(12321);


    }
}
