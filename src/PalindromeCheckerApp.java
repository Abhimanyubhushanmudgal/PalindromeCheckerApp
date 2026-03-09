
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
    static void compareAlgorithms(){

        String word="racecar";

        long start1 = System.nanoTime();
        recursivePalindrome(word,0,word.length()-1);
        long end1 = System.nanoTime();

        System.out.println("Recursive Time: "+(end1-start1));
    }
    public static void main(String[] args) {

        compareAlgorithms();




    }
}
