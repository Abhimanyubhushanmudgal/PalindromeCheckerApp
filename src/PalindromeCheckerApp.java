
import java.util.Scanner;

public class PalindromeCheckerApp {


    // Node class for singly linked list
    static class PalindromeService {

        boolean isPalindrome(String input){

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
    }
    public static void main(String[] args) {

        PalindromeService service = new PalindromeService();
        System.out.println(service.isPalindrome("racecar"));





    }
}
