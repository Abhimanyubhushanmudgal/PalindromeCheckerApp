
import java.util.Scanner;

public class PalindromeCheckerApp {
    static boolean recursivePalindrome(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursivePalindrome(str, start + 1, end - 1);
    }

    // Node class for singly linked list
    static void performanceTest(){

        String word="madam";

        long start = System.nanoTime();

        recursivePalindrome(word,0,word.length()-1);

        long end = System.nanoTime();

        System.out.println("Execution Time: "+(end-start));
    }
    public static void main(String[] args) {

        String word = "level";

        if (recursivePalindrome(word, 0, word.length() - 1)) {
            System.out.println("Recursive Palindrome");
        } else {
            System.out.println("Not Recursive Palindrome");
        }



    }
}
