
import java.util.Scanner;

public class PalindromeCheckerApp {


    // Node class for singly linked list
    static boolean ignoreCaseSpacePalindrome(String input){

        input = input.replaceAll("\\s+","").toLowerCase();

        int start = 0;
        int end = input.length()-1;

        while(start < end){

            if(input.charAt(start) != input.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {

        System.out.println(ignoreCaseSpacePalindrome("Never Odd Or Even"));





    }
}
